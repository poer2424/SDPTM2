package screen;

import engine.Cooldown;
import engine.Core;
import engine.DrawManager;

import java.awt.*;

public class InformationScreen extends Screen {
    private static int count = 0;

    public int getCount() {
        return count;
    }

    private static final int SELECTION_TIME = 200;
    private Cooldown selectionCooldown;

    public InformationScreen(int width, int height, int fps) {
        super(width, height, fps);
        this.returnCode = 50;
        this.count = 0;
        this.selectionCooldown = Core.getCooldown(200);
        this.selectionCooldown.reset();
    }

    public final int run() {
        super.run();
        return this.returnCode;
    }

    protected final void update() {
        super.update();
        this.draw();
        if (this.selectionCooldown.checkFinished() && this.inputDelay.checkFinished()) {
            if (this.inputManager.isKeyDown(32)) {;
            }
        }

    }

    private void next() {
        if(count == 1) {
            // space를 한번만 눌렀을 때, 설명 1번 창 -> 방향키에 대해 설명\
            count++;
            
        }
        else if(count == 2) {
            // space를 2번 눌렀을 때, 설명 2번 창 -> 공격에 대해 설명
            count++;

        }
        else if(count == 3) {
            // space를 3번 눌렀을 때, 설명 3번 창 -> 아이템에 대해 설명
            count++;

        }
        else if(count == 4) {
            count = 0;
            // space를 4번 눌렀을 때, practiceScreen으로 이동
            this.isRunning = false;
        }
    }


    private void draw() {
        this.drawManager.initDrawing(this);
        this.drawManager.drawTutorial(this, this.returnCode, this.count);
        this.drawManager.completeDrawing(this);
    }
}

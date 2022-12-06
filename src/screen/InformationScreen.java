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
            if (this.inputManager.isKeyDown(32)) {
                count++;
                this.next();
            }
        }

    }

    private void next() {
        if(count == 1) {
            // space를 한번만 눌렀을 때, 설명 1번 창 -> 방향키에 대해 설명\
            String infor = "a";
            
        }
        else if(count == 2) {
            // space를 2번 눌렀을 때, 설명 2번 창 -> 공격에 대해 설명
            String infor = "b";

        }
        else if(count == 3) {
            // space를 3번 눌렀을 때, 설명 3번 창 -> 아이템에 대해 설명
            String infor = "c";

        }
        else if(count == 4) {
            count = 0;
            // space를 4번 눌렀을 때, practiceScreen으로 이동
            this.isRunning = false;
        }
    }

    private void previouslevel() {
        if (this.returnCode == 101) {
            this.returnCode = 401;
        } else if (this.returnCode == 401) {
            this.returnCode = 301;
        } else if (this.returnCode == 301) {
            this.returnCode = 201;
        } else if (this.returnCode == 201) {
            this.returnCode = 101;
        } else if (this.returnCode == 102) {
            this.returnCode = 302;
        } else if (this.returnCode == 302) {
            this.returnCode = 202;
        } else if (this.returnCode == 202) {
            this.returnCode = 102;
        } else if (this.returnCode == 103) {
            this.returnCode = 303;
        } else if (this.returnCode == 303) {
            this.returnCode = 203;
        } else if (this.returnCode == 203) {
            this.returnCode = 103;
        } else if (this.returnCode == 104) {
            this.returnCode = 304;
        } else if (this.returnCode == 304) {
            this.returnCode = 204;
        } else if (this.returnCode == 204) {
            this.returnCode = 104;
        } else if (this.returnCode == 105) {
            this.returnCode = 305;
        } else if (this.returnCode == 305) {
            this.returnCode = 205;
        } else if (this.returnCode == 205) {
            this.returnCode = 105;
        } else {
            --this.returnCode;
        }

    }

    private void draw() {
        this.drawManager.initDrawing(this);
        this.drawManager.drawLevelMenu(this, this.returnCode);
        this.drawManager.completeDrawing(this);
    }
}

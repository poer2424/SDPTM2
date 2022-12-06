package screen;

import engine.Cooldown;
import engine.Core;

import java.awt.event.KeyEvent;

public class Infor1Screen extends Screen {
    private static final int SELECTION_TIME = 200;
    private Cooldown selectionCooldown;

    public Infor1Screen(int width, int height, int fps) {
        super(width, height, fps);
        this.returnCode = 112;
        this.selectionCooldown = Core.getCooldown(200);
        this.selectionCooldown.reset();
    }

    public final int run() {
        super.run();
        return this.returnCode;
    }

    protected final void update() {
        super.update();
        draw();
        if (this.selectionCooldown.checkFinished() && this.inputDelay.checkFinished()) {
            if (this.inputManager.isKeyDown(32)) {
                this.isRunning = false;
            }
        }
    }


    private void draw() {
        this.drawManager.initDrawing(this);
        this.drawManager.drawInfor1(this, this.returnCode);
        this.drawManager.completeDrawing(this);
    }
}



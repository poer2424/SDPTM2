package screen;

import engine.Cooldown;
import engine.Core;

import java.awt.event.KeyEvent;

public class SelectScreen extends Screen {
    private static final int SELECTION_TIME = 200;
    private Cooldown selectionCooldown;

    public SelectScreen(int width, int height, int fps) {
        super(width, height, fps);
        this.returnCode = 11;
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

        if (this.selectionCooldown.checkFinished()
                && this.inputDelay.checkFinished()) {

            if (inputManager.isKeyDown(KeyEvent.VK_UP)
                    || inputManager.isKeyDown(KeyEvent.VK_W)) {
                previousselect();
                this.selectionCooldown.reset();
            }
            if (inputManager.isKeyDown(KeyEvent.VK_DOWN)
                    || inputManager.isKeyDown(KeyEvent.VK_S)) {
                nextselect();
                this.selectionCooldown.reset();
            }
            if (inputManager.isKeyDown(KeyEvent.VK_SPACE))
                this.isRunning = false;
        }
    }

    private void nextselect() {
        if (this.returnCode == 11) {
            this.returnCode = 12;
        } else if (this.returnCode == 12) {
            this.returnCode = 11;
        } else {
            ++this.returnCode;
        }

    }

    private void previousselect() {
        if (this.returnCode == 11) {
            this.returnCode = 12;
        } else if (this.returnCode == 12) {
            this.returnCode = 11;
        } else {
            --this.returnCode;
        }

    }

    private void draw() {
        this.drawManager.initDrawing(this);
        this.drawManager.drawSelect(this, this.returnCode);
        this.drawManager.completeDrawing(this);
    }
}


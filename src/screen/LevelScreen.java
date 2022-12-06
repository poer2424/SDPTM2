//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package screen;

import engine.Cooldown;
import engine.Core;

public class LevelScreen extends Screen {
    private static final int SELECTION_TIME = 200;
    private Cooldown selectionCooldown;

    public LevelScreen(int width, int height, int fps) {
        super(width, height, fps);
        this.returnCode = 101;
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
            if (this.inputManager.isKeyDown(37) || this.inputManager.isKeyDown(65)) {
                this.previousstage();
                this.selectionCooldown.reset();
            }

            if (this.inputManager.isKeyDown(39) || this.inputManager.isKeyDown(68)) {
                this.nextstage();
                this.selectionCooldown.reset();
            }

            if (this.inputManager.isKeyDown(38) || this.inputManager.isKeyDown(87)) {
                this.previouslevel();
                this.selectionCooldown.reset();
            }

            if (this.inputManager.isKeyDown(40) || this.inputManager.isKeyDown(83)) {
                this.nextlevel();
                this.selectionCooldown.reset();
            }

            if (this.inputManager.isKeyDown(32)) {
                this.isRunning = false;
            }
        }

    }

    private void nextlevel() {
        if (this.returnCode == 101) {
            this.returnCode = 201;
        } else if (this.returnCode == 201) {
            this.returnCode = 301;
        } else if (this.returnCode == 301) {
            this.returnCode = 401;
        } else if (this.returnCode == 401) {
            this.returnCode = 101;
        } else if (this.returnCode == 102) {
            this.returnCode = 202;
        } else if (this.returnCode == 202) {
            this.returnCode = 302;
        } else if (this.returnCode == 302) {
            this.returnCode = 102;
        } else if (this.returnCode == 103) {
            this.returnCode = 203;
        } else if (this.returnCode == 203) {
            this.returnCode = 303;
        } else if (this.returnCode == 303) {
            this.returnCode = 103;
        } else if (this.returnCode == 104) {
            this.returnCode = 204;
        } else if (this.returnCode == 204) {
            this.returnCode = 304;
        } else if (this.returnCode == 304) {
            this.returnCode = 104;
        } else if (this.returnCode == 105) {
            this.returnCode = 205;
        } else if (this.returnCode == 205) {
            this.returnCode = 305;
        } else if (this.returnCode == 305) {
            this.returnCode = 105;
        } else {
            ++this.returnCode;
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

    private void nextstage() {
        if (this.returnCode == 101) {
            this.returnCode = 102;
        } else if (this.returnCode == 102) {
            this.returnCode = 103;
        } else if (this.returnCode == 103) {
            this.returnCode = 104;
        } else if (this.returnCode == 104) {
            this.returnCode = 105;
        } else if (this.returnCode == 105) {
            this.returnCode = 101;
        } else if (this.returnCode == 201) {
            this.returnCode = 202;
        } else if (this.returnCode == 202) {
            this.returnCode = 203;
        } else if (this.returnCode == 203) {
            this.returnCode = 204;
        } else if (this.returnCode == 204) {
            this.returnCode = 205;
        } else if (this.returnCode == 205) {
            this.returnCode = 201;
        } else if (this.returnCode == 301) {
            this.returnCode = 302;
        } else if (this.returnCode == 302) {
            this.returnCode = 303;
        } else if (this.returnCode == 303) {
            this.returnCode = 304;
        } else if (this.returnCode == 304) {
            this.returnCode = 305;
        } else if (this.returnCode == 305) {
            this.returnCode = 301;
        } else {
            ++this.returnCode;
        }

    }

    private void previousstage() {
        if (this.returnCode == 101) {
            this.returnCode = 105;
        } else if (this.returnCode == 105) {
            this.returnCode = 104;
        } else if (this.returnCode == 104) {
            this.returnCode = 103;
        } else if (this.returnCode == 103) {
            this.returnCode = 102;
        } else if (this.returnCode == 102) {
            this.returnCode = 101;
        } else if (this.returnCode == 201) {
            this.returnCode = 205;
        } else if (this.returnCode == 205) {
            this.returnCode = 204;
        } else if (this.returnCode == 204) {
            this.returnCode = 203;
        } else if (this.returnCode == 203) {
            this.returnCode = 202;
        } else if (this.returnCode == 202) {
            this.returnCode = 201;
        } else if (this.returnCode == 301) {
            this.returnCode = 305;
        } else if (this.returnCode == 305) {
            this.returnCode = 304;
        } else if (this.returnCode == 304) {
            this.returnCode = 303;
        } else if (this.returnCode == 303) {
            this.returnCode = 302;
        } else if (this.returnCode == 302) {
            this.returnCode = 301;
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

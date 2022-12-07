package engine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screen.Infor1Screen;

import static org.junit.jupiter.api.Assertions.*;


class DrawManagerTest {

    @org.junit.jupiter.api.Test
    @DisplayName("drawInfor1")
    void drawInfor1() {

        Infor1Screen infor1Screen = new Infor1Screen(448, 520,60);
        int code = DrawManager.getInstance().drawInfor1(infor1Screen,infor1Screen.getReturnCode());

        assertEquals(112,code);

    }

    @org.junit.jupiter.api.Test
    @DisplayName("drawInfor2")
    void drawInfor2() {
        Infor1Screen infor1Screen = new Infor1Screen(448, 520,60);
        int code = DrawManager.getInstance().drawInfor1(infor1Screen,infor1Screen.getReturnCode());

        assertEquals(113,code);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("drawInfor3")
    void drawInfor3() {
        Infor1Screen infor1Screen = new Infor1Screen(448, 520,60);
        int code = DrawManager.getInstance().drawInfor1(infor1Screen,infor1Screen.getReturnCode());

        assertEquals(50,code);
    }
}
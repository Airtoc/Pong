package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import model.sprites.SBall;
import model.sprites.Sprite;

//Figuras
public class GameFrame extends JPanel {
    //Declaraciones
    private SBall ball;
    private Sprite net;
    private Sprite playerOne;
    private Sprite playerTwo;
    private Sprite buff;
    private Sprite debuff;

    //Constructores
    public GameFrame() {
    }

    public GameFrame(SBall ball, Sprite net, Sprite playerOne, Sprite playerTwo, Sprite buff, Sprite debuff) {
        super();
        this.ball = ball;
        this.net = net;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.buff = buff;
        this.debuff = debuff;
    }

    //Metodos
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        ball = getBall();
        net = getNet();
        playerOne = getPlayerOne();
        playerTwo = getPlayerTwo();
        buff = getBuff();
        if (ball != null && net != null && playerOne != null && playerTwo != null && buff != null && debuff != null) {
            net.paint(g2);
            ball.paint(g2);
            playerOne.paint(g2);
            playerTwo.paint(g2);
            buff.paint(g2);
            debuff.paint(g2);
        }
        repaint();
    }

    //Asignar tecla a un Action
    public void asignarTecla(KeyStroke keyStroke, String clave, Action accion) {
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(keyStroke, clave);
        getActionMap().put(clave, accion);
    }

    //Getters y setters
    public SBall getBall() {
        return ball;
    }

    public void setBall(SBall ball) {
        this.ball = ball;
    }

    public Sprite getNet() {
        return net;
    }

    public void setNet(Sprite net) {
        this.net = net;
    }

    public Sprite getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Sprite playerOne) {
        this.playerOne = playerOne;
    }

    public Sprite getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Sprite playerTwo) {
        this.playerTwo = playerTwo;
    }

    public Sprite getBuff() {
        return buff;
    }

    public void setBuff(Sprite buff) {
        this.buff = buff;
    }

    public Sprite getDebuff() {
        return debuff;
    }

    public void setDebuff(Sprite debuff) {
        this.debuff = debuff;
    }

}
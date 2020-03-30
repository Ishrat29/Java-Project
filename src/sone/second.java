
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sone;

import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author USER
 */
public class second {
    
    boolean goUp,goDown,goRight,goLeft;
    
    second(){
        
       HBox h = new HBox();
       h.setMinHeight(70);
       h.setMinWidth(1330);
       h.setAlignment(Pos.CENTER);
       h.setStyle("-fx-background-color:black");
       
       Image img = new Image("/images/Background.jpg");
       ImageView BackGround = new ImageView(img);
       BackGround.setFitHeight(630);
       BackGround.setFitWidth(1330);
       
       //MOVEMENT OF BLOCK!
       Image b1 = new Image("/images/Tressaract.jpg");
       ImageView Block1 = new ImageView(b1);
       Block1.setFitHeight(30);
       Block1.setFitWidth(30);
       Block1.setX(23);
       Block1.setY(20);
       
       Path pathB1 = new Path();
       pathB1.getElements().add(new MoveTo(23,20));
       pathB1.getElements().add(new VLineTo(455));
       
       PathTransition forB1 = new PathTransition(Duration.seconds(2),pathB1,Block1);
       forB1.setCycleCount(PathTransition.INDEFINITE);
       forB1.setAutoReverse(true);
       forB1.play();
       
       //MOVEMENT OF BLOCK2
       Image b2 = new Image("/images/Tressaract.jpg");
       ImageView Block2 = new ImageView(b2);
       Block2.setFitHeight(30);
       Block2.setFitWidth(30);
       Block2.setX(80);
       Block2.setY(85);
       
       Path pathB2 = new Path();
       pathB2.getElements().add(new MoveTo(80,85));
       pathB2.getElements().add(new VLineTo(629));
       
       PathTransition forB2 = new PathTransition(Duration.seconds(3),pathB2,Block2);
       forB2.setCycleCount(PathTransition.INDEFINITE);
       forB2.setAutoReverse(true);
       forB2.play();
       
       //MOVEMENT OF BLOCK3
       Image b3 = new Image("/images/Tressaract.jpg");
       ImageView Block3 = new ImageView(b3);
       Block3.setFitHeight(30);
       Block3.setFitWidth(30);
       Block3.setX(136);
       Block3.setY(10);
       
       Path pathB3 = new Path();
       pathB3.getElements().add(new MoveTo(136,10));
       pathB3.getElements().add(new VLineTo(630));
       
       PathTransition forB3 = new PathTransition(Duration.seconds(2),pathB3,Block3);
       forB3.setCycleCount(PathTransition.INDEFINITE);
       forB3.setAutoReverse(true);
       forB3.play();
       
       //MOVEMENT OF BLOCK4
       Image b4 = new Image("/images/Tressaract.jpg");
       ImageView Block4 = new ImageView(b4);
       Block4.setFitHeight(30);
       Block4.setFitWidth(30);
       Block4.setX(183);
       Block4.setY(47);
       
       Path pathB4 = new Path();
       pathB4.getElements().add(new MoveTo(183,47));
       pathB4.getElements().add(new VLineTo(629));
       
       PathTransition forB4 = new PathTransition(Duration.seconds(1),pathB4,Block4);
       forB4.setCycleCount(PathTransition.INDEFINITE);
       forB4.setAutoReverse(true);
       forB4.play();
       
       //MOVEMENT OF BLOCK5
       Image b5 = new Image("/images/Tressaract.jpg");
       ImageView Block5 = new ImageView(b5);
       Block5.setFitHeight(30);
       Block5.setFitWidth(30);
       Block5.setX(440);
       Block5.setY(78);
       
       Path pathB5 = new Path();
       pathB5.getElements().add(new MoveTo(440,78));
       pathB5.getElements().add(new VLineTo(629));
       
       PathTransition forB5 = new PathTransition(Duration.seconds(2),pathB5,Block5);
       forB5.setCycleCount(PathTransition.INDEFINITE);
       forB5.setAutoReverse(true);
       forB5.play();
       
       //MOVEMENT OF BLOCK6
       Image b6 = new Image("/images/Tressaract.jpg");
       ImageView Block6 = new ImageView(b6);
       Block6.setFitHeight(30);
       Block6.setFitWidth(30);
       Block6.setX(485);
       Block6.setY(25);
       
       Path pathB6 = new Path();
       pathB6.getElements().add(new MoveTo(485,25));
       pathB6.getElements().add(new VLineTo(630));
       
       PathTransition forB6 = new PathTransition(Duration.seconds(3),pathB6,Block6);
       forB6.setCycleCount(PathTransition.INDEFINITE);
       forB6.setAutoReverse(true);
       forB6.play();
       
       //MOVEMENT OF BLOCK7
       Image b7 = new Image("/images/Tressaract.jpg");
       ImageView Block7 = new ImageView(b7);
       Block7.setFitHeight(30);
       Block7.setFitWidth(30);
       Block7.setX(545);
       Block7.setY(10);
       
       Path pathB7 = new Path();
       pathB7.getElements().add(new MoveTo(545,10));
       pathB7.getElements().add(new VLineTo(629));
       
       PathTransition forB7 = new PathTransition(Duration.seconds(4),pathB7,Block7);
       forB7.setCycleCount(PathTransition.INDEFINITE);
       forB7.setAutoReverse(true);
       forB7.play();
       
       //MOVEMENT OF BLOCK8
       Image b8 = new Image("/images/Tressaract.jpg");
       ImageView Block8 = new ImageView(b8);
       Block8.setFitHeight(30);
       Block8.setFitWidth(30);
       Block8.setX(602);
       Block8.setY(100);
       
       Path pathB8 = new Path();
       pathB8.getElements().add(new MoveTo(602,100));
       pathB8.getElements().add(new VLineTo(630));
       
       PathTransition forB8 = new PathTransition(Duration.seconds(1),pathB8,Block8);
       forB8.setCycleCount(PathTransition.INDEFINITE);
       forB8.setAutoReverse(true);
       forB8.play();
       
       //MOVEMENT OF BLOCK9
       Image b9 = new Image("/images/Tressaract.jpg");
       ImageView Block9 = new ImageView(b9);
       Block9.setFitHeight(30);
       Block9.setFitWidth(30);
       Block9.setX(641);
       Block9.setY(41);
       
       Path pathB9 = new Path();
       pathB9.getElements().add(new MoveTo(641,41));
       pathB9.getElements().add(new VLineTo(629));
       
       PathTransition forB9 = new PathTransition(Duration.seconds(2),pathB9,Block9);
       forB9.setCycleCount(PathTransition.INDEFINITE);
       forB9.setAutoReverse(true);
       forB9.play();
       
       //MOVEMENT OF BLOCK10
       Image b10 = new Image("/images/Tressaract.jpg");
       ImageView Block10 = new ImageView(b10);
       Block10.setFitHeight(30);
       Block10.setFitWidth(30);
       Block10.setX(909);
       Block10.setY(100);
       
       Path pathB10 = new Path();
       pathB10.getElements().add(new MoveTo(909,100));
       pathB10.getElements().add(new VLineTo(630));
       
       PathTransition forB10 = new PathTransition(Duration.seconds(2),pathB10,Block10);
       forB10.setCycleCount(PathTransition.INDEFINITE);
       forB10.setAutoReverse(true);
       forB10.play();
       
       //MOVEMENT OF BLOCK11
       Image b11 = new Image("/images/Tressaract.jpg");
       ImageView Block11 = new ImageView(b11);
       Block11.setFitHeight(30);
       Block11.setFitWidth(30);
       Block11.setX(852);
       Block11.setY(41);
       
       Path pathB11 = new Path();
       pathB11.getElements().add(new MoveTo(852,41));
       pathB11.getElements().add(new VLineTo(630));
       
       PathTransition forB11 = new PathTransition(Duration.seconds(1),pathB11,Block11);
       forB11.setCycleCount(PathTransition.INDEFINITE);
       forB11.setAutoReverse(true);
       forB11.play();
       
       //MOVEMENT OF BLOCK12
       Image b12 = new Image("/images/Tressaract.jpg");
       ImageView Block12 = new ImageView(b12);
       Block12.setFitHeight(30);
       Block12.setFitWidth(30);
       Block12.setX(1097);
       Block12.setY(85);
       
       Path pathB12 = new Path();
       pathB12.getElements().add(new MoveTo(1097,85));
       pathB12.getElements().add(new VLineTo(630));
       
       PathTransition forB12 = new PathTransition(Duration.seconds(1),pathB12,Block12);
       forB12.setCycleCount(PathTransition.INDEFINITE);
       forB12.setAutoReverse(true);
       forB12.play();
       
       //MOVEMENT OF BLOCK13
       Image b13 = new Image("/images/Tressaract.jpg");
       ImageView Block13 = new ImageView(b13);
       Block13.setFitHeight(30);
       Block13.setFitWidth(30);
       Block13.setX(1146);
       Block13.setY(16);
       
       Path pathB13 = new Path();
       pathB13.getElements().add(new MoveTo(1146,16));
       pathB13.getElements().add(new VLineTo(629));
       
       PathTransition forB13 = new PathTransition(Duration.seconds(2),pathB13,Block13);
       forB13.setCycleCount(PathTransition.INDEFINITE);
       forB13.setAutoReverse(true);
       forB13.play();
       
       //MOVEMENT OF THANOS
       Image thanos = new Image("/images/Thanos.jpg");
       ImageView Thanos = new ImageView(thanos);
       Thanos.setFitHeight(105);
       Thanos.setFitWidth(70);
       Thanos.setX(285);
       Thanos.setY(85);
       
       Path pathThanos = new Path();
       pathThanos.getElements().add(new MoveTo(285,85));
       pathThanos.getElements().add(new VLineTo(560));
       
       PathTransition forThanos = new PathTransition(Duration.seconds(1),pathThanos,Thanos);
       forThanos.setCycleCount(PathTransition.INDEFINITE);
       forThanos.setAutoReverse(true);
       forThanos.play();
       
       //MOVEMENT OF LOKI
       Image loki = new Image("/images/Loki.jpg");
       ImageView Loki = new ImageView(loki);
       Loki.setFitHeight(105);
       Loki.setFitWidth(70);
       Loki.setX(981);
       Loki.setY(100);
       
       Path pathLoki = new Path();
       pathLoki.getElements().add(new MoveTo(981,100));
       pathLoki.getElements().add(new VLineTo(560));
       
       PathTransition forLoki = new PathTransition(Duration.seconds(1),pathLoki,Loki);
       forLoki.setCycleCount(PathTransition.INDEFINITE);
       forLoki.setAutoReverse(true);
       forLoki.play();
       
       //MOVEMENT OF ULTRON
       Image ultron = new Image("/images/Ultron.jpg");
       ImageView Ultron = new ImageView(ultron);
       Ultron.setFitHeight(105);
       Ultron.setFitWidth(70);
       Ultron.setX(734);
       Ultron.setY(93);
       
       Path pathUltron = new Path();
       pathUltron.getElements().add(new MoveTo(734,93));
       pathUltron.getElements().add(new VLineTo(560));
       
       PathTransition forUltron = new PathTransition(Duration.seconds(1),pathUltron,Ultron);
       forUltron.setCycleCount(PathTransition.INDEFINITE);
       forUltron.setAutoReverse(true);
       forUltron.play();
       
       //SETTING THE INFINITY STONES
       Image soulStone = new Image("/images/SoulStone.jpg");
       ImageView Soul = new ImageView(soulStone);
       Soul.setFitHeight(35);
       Soul.setFitWidth(21);
       Soul.setX(80);
       Soul.setY(15);
      
       Image powerStone = new Image("/images/PowerStone.jpg");
       ImageView Power = new ImageView(powerStone);
       Power.setFitHeight(35);
       Power.setFitWidth(21);
       Power.setX(387);
       Power.setY(526);
       
       Image realityStone = new Image("/images/RealityStone.jpg");
       ImageView Reality = new ImageView(realityStone);
       Reality.setFitHeight(35);
       Reality.setFitWidth(21);
       Reality.setX(594);
       Reality.setY(0);
       
       Image spaceStone = new Image("/images/SpaceStone.jpg");
       ImageView Space = new ImageView(spaceStone);
       Space.setFitHeight(35);
       Space.setFitWidth(21);
       Space.setX(804);
       Space.setY(574);
       
       Image mindStone = new Image("/images/MindStone.jpg");
       ImageView Mind = new ImageView(mindStone);
       Mind.setFitHeight(35);
       Mind.setFitWidth(21);
       Mind.setX(909);
       Mind.setY(15);
       
       Image timeStone = new Image("/images/TimeStone.jpg");
       ImageView Time = new ImageView(timeStone);
       Time.setFitHeight(35);
       Time.setFitWidth(21);
       Time.setX(18);
       Time.setY(573);
       
       Image thor = new Image("/images/Thor.jpg");
       ImageView Thor = new ImageView(thor);
       Thor.setFitHeight(105);
       Thor.setFitWidth(105);
       Thor.relocate(1190,271);

       
       Button btn = new Button("EXIT");
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
             Platform.exit();     
           }
       });
       
       h.getChildren().addAll(btn);
       
       AnchorPane pane = new AnchorPane(h);
       pane.setMinHeight(700);
       pane.setMinWidth(1330);
       
       pane.setBottomAnchor(h,0.0);
       pane.getChildren().addAll(BackGround,Block1,Block2,Block3,Block4,Block5,Block6,Block7,Block8,Block9,Block10,Block11,Block12,Block13,Thanos,Loki,Ultron,Soul,Power,Reality,Space,Mind,Time,Thor);
       
       Scene scene = new Scene(pane);
       Stage stage = new Stage();
       stage.setScene(scene);
       stage.show();
       
       scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=true;break;
                   case DOWN: goDown=true;break;
                   case LEFT: goLeft=true;break;
                   case RIGHT: goRight=true;break;
               }   
           }
       });
       
       scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
           @Override
           public void handle(KeyEvent event) {
               switch(event.getCode()){
                   case UP: goUp=false;break;
                   case DOWN: goDown=false;break;
                   case LEFT: goLeft=false;break;
                   case RIGHT: goRight=false;break;
           }       
          }
       });
       
       AnimationTimer timer = new AnimationTimer(){
           double delta = 4;
           @Override
           public void handle(long now) {
               double currX=Thor.getLayoutX();
               double currY=Thor.getLayoutY();
               
               if(goUp) currY-=delta;
               if(goDown) currY+=delta;
               if(goLeft) currX-=delta;
               if(goRight) currX+=delta;
               Thor.relocate(currX,currY);
           }
       };
       timer.start();
   }
 
  /*  //For Background Music
 public void start(Stage s) throws Exception{
        music();
    }
    
   
    MediaPlayer mediaplayer;
    public void music(){
        String s="sone.mp3";
        Media h= new Media(Paths.get(s).toUri().toString());
        mediaplayer = new MediaPlayer(h);
        mediaplayer.play();
    }
    
    
    */
       
 }

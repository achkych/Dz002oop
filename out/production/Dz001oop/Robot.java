����   = J
      java/lang/Object <init> ()V	  	 
   Robot name Ljava/lang/String;	     maxRunDistance I	     maxJumpHeight	      java/lang/System out Ljava/io/PrintStream;      makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String;
    ! " # java/io/PrintStream println (Ljava/lang/String;)V       (Ljava/lang/String;II)V Code LineNumberTable LocalVariableTable this LRobot; run (I)V distance StackMapTable jump height 
SourceFile 
Robot.java BootstrapMethods 7
 8 9 :  ; $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; = ;Робот  успешно пробежал  метров ? <Робот  не смог пробежать  метров A [Робот  успешно перепрыгнул стену высотой  метров C \Робот  не смог перепрыгнуть стену высотой  метров InnerClasses F %java/lang/invoke/MethodHandles$Lookup H java/lang/invoke/MethodHandles Lookup !                        '  (   l     *� *+� *� *� �    )          	   	  
 *   *     + ,                      - .  (   v     ,*� � � *� �   � � � *� � $  � �    )            +  *       , + ,     , /   0      1 .  (   v     ,*� � � *� � %  � � � *� � &  � �    )            +  *       , + ,     , 2   0      3    4 5     6  < 6  > 6  @ 6  B D   
  E G I 
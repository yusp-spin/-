package com.study.designPattern.抽象工厂模式.Factory;

import com.study.designPattern.抽象工厂模式.color.Color;
import com.study.designPattern.抽象工厂模式.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor (String color);
    public abstract Shape getShape (String shape);
}

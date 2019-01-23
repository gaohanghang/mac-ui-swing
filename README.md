# 一个仿Mac的界面UI，基于swing上

> 项目来自 [Actuality](https://github.com/krirtocc/Actuality)
> 原作者 [krirtocc](https://github.com/krirtocc)
> 我进行了一些改进
> 欢迎通过发起Issue, 提出您的改进意见

## 快速开始

```java
public class MacUiTest {
    public static void main(String[] args) {
        MacUiFrame macUiFrame = new MacUiFrame();
        macUiFrame.setTitle("hello world!");
        macUiFrame.setSize(300, 170);
        macUiFrame.setVisible(true);
    }
}
```

## 效果图

![](https://ws1.sinaimg.cn/large/006tNc79ly1fzgzh5vev5j308c04qt8j.jpg)

## 优化点

- 窗体改为默认居中
- 类名优化
- 分包

## 待优化

- 代码注释添加
- 代码名称规范化
- mac系统上最大化无效
- 窗体背景颜色添加多个选择
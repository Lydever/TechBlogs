
// B计算了offsetHeight，C重新设置了高度。
// A打印出类名，无影响。
// D重新设置背景，引起重绘。
//
//
// reflow(回流)和repaint(重绘)
// 简要：整个在浏览器的渲染过程中（页面初始化，用户行为改变界面样式，动画改变界面样式等）reflow(回流)和repaint(重绘) 会大大影响web性能，尤其是手机页面。因此我们在页面设计的时候要尽量减少reflow和repaint。
// 什么是reflow和repaint（原文链接：http://www.cnblogs.com/Peng2014/p/4687218.html）
// reflow：例如某个子元素样式发生改变，直接影响到了其父元素以及往上追溯很多祖先元素（包括兄弟元素），这个时候浏览器要重新去渲染这个子元素相关联的所有元素的过程称为回流。
// reflow：几乎是无法避免的。现在界面上流行的一些效果，比如树状目录的折叠、展开（实质上是元素的显 示与隐藏）等，都将引起浏览器的 reflow。鼠标滑过、点击……只要这些行为引起了页面上某些元素的占位面积、定位方式、边距等属性的变化，都会引起它内部、周围甚至整个页面的重新渲 染。通常我们都无法预估浏览器到底会 reflow 哪一部分的代码，它们都彼此相互影响着。
// repaint：如果只是改变某个元素的背景色、文 字颜色、边框颜色等等不影响它周围或内部布局的属性，将只会引起浏览器 repaint（重绘）。repaint 的速度明显快于 reflow

// 下面情况会导致reflow发生
// 1：改变窗口大小
// 2：改变文字大小
// 3：内容的改变，如用户在输入框中敲字
// 4：激活伪类，如:hover
// 5：操作class属性
// 6：脚本操作DOM
// 7：计算offsetWidth和offsetHeight
// 8：设置style属性
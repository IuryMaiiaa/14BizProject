package Telas;


import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;

public class TitleScreen extends CCLayer{
	
	public CCScene scene() {
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
		
	}
	
}

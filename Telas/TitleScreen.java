package Telas;

import static config.DeviceSettings.screenHeight;
import static config.DeviceSettings.screenWidth;
import static config.DeviceSettings.screenResolution;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

import config.Assets;
import android.R;

public class TitleScreen extends CCLayer{
	
	ScreenBackground backGround;
	
	public TitleScreen() {
		this.backGround  = new ScreenBackground(Assets.BACKGROUND);
		this.backGround.setPosition(screenResolution(CGPoint.ccp(
					screenWidth() / 2, screenHeight() / 2)));
		this.addChild(this.backGround);
		
		
		CCSprite title = CCSprite.sprite(Assets.LOGO);
		title.setPosition(screenResolution(CGPoint.ccp(screenWidth()/2, screenHeight()-130)));
		this.addChild(title);
	}
	
	public CCScene scene() {
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
		
	}
	
}

package com.discobeard.spriter.test;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.discobeard.spriter.draw.AbstractDrawer;
import com.discobeard.spriter.draw.DrawInstruction;
import com.discobeard.spriter.file.FileLoader;

public class SpriteDrawer extends AbstractDrawer<Sprite> {

	private final SpriteBatch batch;
	
	public SpriteDrawer(FileLoader<Sprite> loader, SpriteBatch batch) {
		super(loader);
		this.batch = batch;
	}

	@Override
	public void draw(DrawInstruction instruction) {

		draw(getFile(instruction.getRef()), instruction.getX(), instruction.getY(), instruction.getPivot_x(),
				instruction.getPivot_y(), instruction.getScale_x(), instruction.getScale_y(), instruction.getAngle(),
				instruction.getAlpha());

	}

	private void draw(Sprite sprite, float x, float y, float pivot_x, float pivot_y, float scale_x, float scale_y,
			float angle, float alpha) {

		float newPivotX = (sprite.getWidth() * (pivot_x));
		float newX = x - newPivotX;
		float newPivotY = (sprite.getHeight() * (pivot_y));
		float newY = y - newPivotY;
		
		sprite.setX(newX);
		sprite.setY(newY);
		
		sprite.setOrigin(sprite.getWidth()*(pivot_x), sprite.getHeight()*(pivot_y));
		sprite.setRotation(angle);
		
		sprite.setColor(1f, 1f, 1f, alpha);
		sprite.setScale(scale_x, scale_y);

		sprite.draw(batch);		
	}

}

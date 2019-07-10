package com.inks.sokoban;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

@SuppressLint("AppCompatCustomView")
public class SokobanView extends ImageView {
	ArrayList<int[][]> arrayList = new ArrayList<>();
	int[][][] ccc =new int[300][15][15];
	int kk=0;
	Canvas canvas;
	private int mWidth ;
	private int mHeight ;
	Boolean flag=false;
	Bitmap bitmap0= BitmapFactory.decodeResource(getResources(), R.drawable.qiang);
	Bitmap bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.kong);
	Bitmap bitmap2= BitmapFactory.decodeResource(getResources(),R.drawable.ren_1);
	Bitmap bitmap3= BitmapFactory.decodeResource(getResources(),R.drawable.xiang_1);
	Bitmap bitmap4= BitmapFactory.decodeResource(getResources(),R.drawable.xiang_2);
	Bitmap bitmap5= BitmapFactory.decodeResource(getResources(),R.drawable.hua);
	Bitmap bitmap6= BitmapFactory.decodeResource(getResources(),R.drawable.renandhua);
	int [][]aaa= {//0是墙，1是空，2是人，3是空箱子，4是满箱子，5是花,6是人加花
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,5,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,3,1,3,5,0,0,0,0,0},
			{0,0,0,0,5,3,2,1,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,3,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,5,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};

	public interface PassLitener
	{
		void pass();
	}
	private PassLitener mPassLitener;
	public void setPassLitener(PassLitener mPassLitener)
	{
		this.mPassLitener = mPassLitener;
	}

	public SokobanView(Context context) {
		super(context);
		init("MyImageView(Context context)");
	}

	public SokobanView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init("MyImageView(Context context, AttributeSet attrs)");
	}

	public SokobanView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init("MyImageView(Context context, AttributeSet attrs, int defStyle)");

	}

	private void init(String structName) {
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int specSizeW = MeasureSpec.getSize(widthMeasureSpec);
		int specSizeH = MeasureSpec.getSize(heightMeasureSpec);
		mWidth = specSizeW;
		if(mWidth>specSizeH){
			mWidth = specSizeH;
		}
		setMeasuredDimension(mWidth, mWidth);

	}

	@Override
	protected void onDraw(Canvas canvas) {
		Log.e("onDraw：","onDraw");
		this.canvas=canvas;
		super.onDraw(canvas);
		Paint p=new Paint();
		p.setColor(Color.RED);
		//canvas.drawRect(20,20,100,100,p);
		//canvas.drawColor(Color.RED);
		for(int i=0;i<15;i++){
			for(int k=0;k<15;k++){
				int x=aaa[i][k];

				Rect rect = new Rect((mWidth/15)*k,(mWidth/15)*i,(mWidth/15)*(k+1),(mWidth/15)*(i+1));
				switch (x){
					case 0:
						canvas.drawBitmap(bitmap0,null,rect,p);
						break;
					case 1:
						canvas.drawBitmap(bitmap1,null,rect,p);
						break;
					case 2:
						canvas.drawBitmap(bitmap2,null,rect,p);
						break;
					case 3:
						canvas.drawBitmap(bitmap3,null,rect,p);
						break;
					case 4:
						canvas.drawBitmap(bitmap4,null,rect,p);
						break;
					case 5:
						canvas.drawBitmap(bitmap5,null,rect,p);
						break;
					case 6:
						canvas.drawBitmap(bitmap6,null,rect,p);
						break;

				}
			}
		}



	}

	public void setaaa(int [][]xxx){
		for(int i=0;i<15;i++){
			for(int k=0;k<15;k++) {
				aaa[i][k]=xxx[i][k];
			}
		}
		kk=0;
		arrayList.clear();
		postInvalidate();
	}
	public void moveLeft(){
		addBack();
		flag=false;
		for(int i=0;i<15;i++){
			if (flag){
				break;
			}
			for(int k=0;k<15;k++) {
				if (flag){
					break;
				}
				int x = aaa[i][k];
				if(x==2|x==6){
					Log.e("x",""+x+"i:"+i+"k:"+k);

					switch ( aaa[i][k-1]){
						case 0://左边是墙，不能移动
							break;
						case 1://左边是空，可以移动
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i][k-1]=2;

							break;
						case 3://左边是空箱子
							if(aaa[i][k-2]==5){//箱子左边是花
								aaa[i][k-2]=4;
								aaa[i][k-1]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}

							}else if(aaa[i][k-2]==1){//箱子左边是空
								aaa[i][k-2]=3;
								aaa[i][k-1]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}

							}else{}//是其他则不能移动

							break;
						case 4://左边是满箱子
							if(aaa[i][k-2]==5){//箱子左边是花
								aaa[i][k-2]=4;
								aaa[i][k-1]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}

							}else if(aaa[i][k-2]==1){//箱子左边是空
								aaa[i][k-2]=3;
								aaa[i][k-1]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}

							}else{}//是其他则不能移动
							break;
						case 5://左边是花
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i][k-1]=6;

							break;
					}
					flag=true;
				}
			}
		}


		postInvalidate();
		ifPass();
	}
	public void moveRight(){
		addBack();
		flag=false;
		for(int i=0;i<15;i++){
			if (flag){
				break;
			}
			for(int k=0;k<15;k++) {
				int x = aaa[i][k];
				if (flag){
					break;
				}
				if(x==2|x==6){
					Log.e("x",""+x+"i:"+i+"k:"+k);
					switch ( aaa[i][k+1]){
						case 0://右边是墙，不能移动
							break;
						case 1://右边是空，可以移动
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i][k+1]=2;
							break;
						case 3://右边是空箱子
							if(aaa[i][k+2]==5){//箱子右边是花
								aaa[i][k+2]=4;
								aaa[i][k+1]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i][k+2]==1){//箱子右边是空
								aaa[i][k+2]=3;
								aaa[i][k+1]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 4://右边是满箱子
							if(aaa[i][k+2]==5){//箱子右边是花
								aaa[i][k+2]=4;
								aaa[i][k+1]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i][k+2]==1){//箱子右边是空
								aaa[i][k+2]=3;
								aaa[i][k+1]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 5://右边是花
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i][k+1]=6;
							break;
					}
					flag=true;
				}
			}
		}

		postInvalidate();
		ifPass();
	}
	public void moveUp(){
		addBack();
		flag=false;
		for(int i=0;i<15;i++){
			if (flag){
				break;
			}
			for(int k=0;k<15;k++) {
				int x = aaa[i][k];
				if (flag){
					break;
				}
				if(x==2|x==6){
					Log.e("x",""+x+"i:"+i+"k:"+k);
					switch ( aaa[i-1][k]){
						case 0://上边是墙，不能移动
							break;
						case 1://上边是空，可以移动
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i-1][k]=2;
							break;
						case 3://上边是空箱子
							if(aaa[i-2][k]==5){//箱子上边是花
								aaa[i-2][k]=4;
								aaa[i-1][k]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i-2][k]==1){//箱子上边是空
								aaa[i-2][k]=3;
								aaa[i-1][k]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 4://上边是满箱子
							if(aaa[i-2][k]==5){//箱子上边是花
								aaa[i-2][k]=4;
								aaa[i-1][k]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i-2][k]==1){//箱子上边是空
								aaa[i-2][k]=3;
								aaa[i-1][k]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 5://上边是花
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i-1][k]=6;
							break;
					}
					flag=true;
				}
			}
		}

		postInvalidate();
		ifPass();
	}
	public void moveDown(){
		addBack();
		flag=false;
		for(int i=0;i<15;i++){
			if (flag){
				break;
			}
			for(int k=0;k<15;k++) {
				int x = aaa[i][k];
				if (flag){
					break;
				}
				if(x==2|x==6){
					Log.e("x",""+x+"i:"+i+"k:"+k);
					switch ( aaa[i+1][k]){
						case 0://下边是墙，不能移动
							break;
						case 1://下边是空，可以移动
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i+1][k]=2;
							break;
						case 3://下边是空箱子
							if(aaa[i+2][k]==5){//箱子下边是花
								aaa[i+2][k]=4;
								aaa[i+1][k]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i+2][k]==1){//箱子下边是空
								aaa[i+2][k]=3;
								aaa[i+1][k]=2;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 4://下边是满箱子
							if(aaa[i+2][k]==5){//箱子下边是花
								aaa[i+2][k]=4;
								aaa[i+1][k]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else if(aaa[i+2][k]==1){//箱子下边是空
								aaa[i+2][k]=3;
								aaa[i+1][k]=6;
								if(x==6){
									aaa[i][k]=5;
								}else{
									aaa[i][k]=1;
								}
							}else{}//是其他则不能移动
							break;
						case 5://下边是花
							if(x==6){
								aaa[i][k]=5;
							}else{
								aaa[i][k]=1;
							}
							aaa[i+1][k]=6;
							break;
					}
					flag=true;
				}
			}
		}
		postInvalidate();
		ifPass();
	}

	public void ifPass(){
		flag=false;
		for(int i=0;i<15;i++){
			if (flag){
				break;
			}
			for(int k=0;k<15;k++) {
				int x = aaa[i][k];
				if (flag){
					break;
				}
				if(x==3){//还有空箱子
					flag=true;
				}
			}
		}

		if (!flag){//没有一个空箱子
			mPassLitener.pass();
		}
	}

	public void moveBack(){
		if(arrayList.size()>0){
			this.aaa=(arrayList.get(arrayList.size()-1));
			postInvalidate();
			arrayList.remove(arrayList.size()-1);
		}
	}
	public void addBack(){
		if(kk>299){
			arrayList.clear();
			kk=0;
		}
		if(arrayList.size()>99){
			arrayList.remove(0);
		}
		for(int i=0;i<15;i++){
			for(int k=0;k<15;k++){
				ccc[kk][i][k]=aaa[i][k];
			}
		}
		arrayList.add(ccc[kk]);
		kk++;
	}

}

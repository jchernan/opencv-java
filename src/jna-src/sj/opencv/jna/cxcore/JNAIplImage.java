/* Description and License
 * A Java library that wraps the functionality of the native image 
 * processing library OpenCV
 *
 * (c) Sigurdur Orn Adalgeirsson (siggi@alum.mit.edu)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 */
 
package sj.opencv.jna.cxcore;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import sj.opencv.jna.cxcore.CxcoreLibrary.IplTileInfo;
/**
 * <i>native declaration : modules/core/include/opencv2/core/types_c.h:1400</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class JNAIplImage extends Structure {
	/// sizeof(IplImage)
	public int nSize;
	/// version (=0)
	public int ID;
	/// Most of OpenCV functions support 1,2,3 or 4 channels
	public int nChannels;
	/// Ignored by OpenCV
	public int alphaChannel;
	/**
	 * Pixel depth in bits: IPL_DEPTH_8U, IPL_DEPTH_8S, IPL_DEPTH_16S,<br>
	 * IPL_DEPTH_32S, IPL_DEPTH_32F and IPL_DEPTH_64F are supported.
	 */
	public int depth;
	/**
	 * Ignored by OpenCV<br>
	 * C type : char[4]
	 */
	public byte[] colorModel = new byte[4];
	/**
	 * ditto<br>
	 * C type : char[4]
	 */
	public byte[] channelSeq = new byte[4];
	/**
	 * 0 - interleaved color channels, 1 - separate color channels.<br>
	 * cvCreateImage can only create interleaved images
	 */
	public int dataOrder;
	/**
	 * 0 - top-left origin,<br>
	 * 1 - bottom-left origin (Windows bitmaps style).
	 */
	public int origin;
	/**
	 * Alignment of image rows (4 or 8).<br>
	 * OpenCV ignores it and uses widthStep instead.
	 */
	public int align;
	/// Image width in pixels.
	public int width;
	/// Image height in pixels.
	public int height;
	/**
	 * Image ROI. If NULL, the whole image is selected.<br>
	 * C type : _IplROI*
	 */
	public sj.opencv.jna.cxcore.IplROI.ByReference roi;
	/**
	 * Must be NULL.<br>
	 * C type : _IplImage*
	 */
	public JNAIplImage.ByReference maskROI;
	/**
	 * "           "<br>
	 * C type : void*
	 */
	public Pointer imageId;
	/**
	 * "           "<br>
	 * C type : _IplTileInfo*
	 */
	public IplTileInfo tileInfo;
	/**
	 * Image data size in bytes<br>
	 * (==image->height*image->widthStep<br>
	 * in case of interleaved data)
	 */
	public int imageSize;
	/**
	 * Pointer to aligned image data.<br>
	 * C type : char*
	 */
	public Pointer imageData;
	/// Size of aligned image row in bytes.
	public int widthStep;
	/**
	 * Ignored by OpenCV.<br>
	 * C type : int[4]
	 */
	public int[] BorderMode = new int[4];
	/**
	 * Ditto.<br>
	 * C type : int[4]
	 */
	public int[] BorderConst = new int[4];
	/**
	 * Pointer to very origin of image data<br>
	 * (not necessarily aligned) -<br>
	 * needed for correct deallocation<br>
	 * C type : char*
	 */
	public Pointer imageDataOrigin;
	public JNAIplImage() {
		super();
		initFieldOrder();
	}

	public JNAIplImage(Pointer p){
		super(p);
	}

	protected void initFieldOrder() {
		setFieldOrder(new String[]{"nSize", "ID", "nChannels", "alphaChannel", "depth", "colorModel", "channelSeq", "dataOrder", "origin", "align", "width", "height", "roi", "maskROI", "imageId", "tileInfo", "imageSize", "imageData", "widthStep", "BorderMode", "BorderConst", "imageDataOrigin"});
	}
	public static class ByReference extends JNAIplImage implements Structure.ByReference {
		public ByReference(Pointer p){
			super(p);
		}
	};
	public static class ByValue extends JNAIplImage implements Structure.ByValue {

	};
}

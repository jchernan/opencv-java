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
/**
 * <i>native declaration : modules/core/include/opencv2/core/types_c.h:1860</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CvContour extends Structure {
	public int flags;
	public int header_size;
	/// C type : CvSeq*
	public sj.opencv.jna.cxcore.CvSeq.ByReference h_prev;
	/// C type : CvSeq*
	public sj.opencv.jna.cxcore.CvSeq.ByReference h_next;
	/// C type : CvSeq*
	public sj.opencv.jna.cxcore.CvSeq.ByReference v_prev;
	/// C type : CvSeq*
	public sj.opencv.jna.cxcore.CvSeq.ByReference v_next;
	public int total;
	public int elem_size;
	/// C type : schar*
	public Pointer block_max;
	/// C type : schar*
	public Pointer ptr;
	public int delta_elems;
	/// C type : CvMemStorage*
	public sj.opencv.jna.cxcore.CvMemStorage.ByReference storage;
	/// C type : CvSeqBlock*
	public sj.opencv.jna.cxcore.CvSeqBlock.ByReference free_blocks;
	/// C type : CvSeqBlock*
	public sj.opencv.jna.cxcore.CvSeqBlock.ByReference first;
	/// C type : CvRect
	public CvRect rect;
	public int color;
	/// C type : int[3]
	public int[] reserved = new int[3];
	public CvContour() {
		super();
		initFieldOrder();
	}

	public CvContour(Pointer p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	protected void initFieldOrder() {
		setFieldOrder(new String[]{"flags", "header_size", "h_prev", "h_next", "v_prev", "v_next", "total", "elem_size", "block_max", "ptr", "delta_elems", "storage", "free_blocks", "first", "rect", "color", "reserved"});
	}
	public static class ByReference extends CvContour implements Structure.ByReference {

		public ByReference() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ByReference(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

	};
	public static class ByValue extends CvContour implements Structure.ByValue {

	};
}
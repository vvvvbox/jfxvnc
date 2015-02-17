package org.jfxvnc.net.rfb.codec;

/**
 * Encoding types
 * 
 * <code>
 * 0 Raw<br>
 * 1 CopyRect<br>
 * 2 RRE<br>
 * 5 Hextile<br>
 * 16 ZRLE<br>
 * -239 Cursor pseudo-encoding<br>
 * -223 DesktopSize pseudo-encoding<br>
 * 4 CoRRE<br>
 * 6 zlib<br>
 * 7 tight<br>
 * 8 zlibhex<br>
 * 15 TRLE<br>
 * 17 Hitachi ZYWRLE<br>
 * 18 Adam Walling XZ<br>
 * 19 Adam Walling XZYW<br>
 * -1 to -222<br>
 * -224 to -238<br>
 * -240 to -256 tight options<br>
 * -257 to -272 Anthony Liguori<br>
 * -273 to -304 VMWare<br>
 * -305 gii<br>
 * -306 popa<br>
 * -307 Peter Astrand DesktopName<br>
 * -308 Pierre Ossman ExtendedDesktopSize<br>
 * -309 Colin Dean xvp<br>
 * -310 OLIVE Call Control<br>
 * -311 CursorWithAlpha<br>
 * -412 to -512 TurboVNC fine-grained quality level<br>
 * -763 to -768 TurboVNC subsampling level<br>
 * 0x574d5600 to 0x574d56ff VMWare<br>
 * </code>
 *
 */
public interface IEncodings {

    int RAW = 0;
    int COPY_RECT = 1;
    int RRE = 2;
    int HEXTILE = 3;

    int CO_RRE = 4;
    int ZLIB = 6;
    int TIGHT = 7;
    int ZLIB_HEX = 8;
    int TRLE = 15;
    int ZRLE = 16;

    int H_ZYWRLE = 17;
    int AW_XZ = 18;
    int AW_XZYW = 19;

    int CURSOR = -239;
    int DESKTOP_SIZE = -223;

    default String toEncodingName(int i) {

	switch (i) {
	case RAW:
	    return "Raw";
	case COPY_RECT:
	    return "CopyRect";
	case RRE:
	    return "RRE";
	case HEXTILE:
	    return "Hextile";
	case CO_RRE:
	    return "CoRRE";
	case ZLIB:
	    return "zLib";
	case TIGHT:
	    return "Tight";
	default:
	    return "UNKNOWN (" + i + ")";
	}
    }
}

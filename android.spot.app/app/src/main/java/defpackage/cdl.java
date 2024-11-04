package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdl {
    private static final Set A;
    private static final HashMap B;
    private static final byte[] C;
    private static final jba[] N;
    private static final jba[] O;
    private static final jba[] P;
    private static final jba[] Q;
    private static final jba[] R;
    private static final jba S;
    private static final jba[] T;
    private static final jba[] U;
    private static final jba[] V;
    private static final jba[] W;
    private static final jba[] X;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final Charset g;
    static final byte[] h;
    static final jba[][] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static SimpleDateFormat w;
    private static SimpleDateFormat x;
    private static final HashMap[] y;
    private static final HashMap[] z;
    private final FileDescriptor D;
    private final AssetManager.AssetInputStream E;
    private int F;
    private final HashMap[] G;
    private final Set H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    public ByteOrder i;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        k = new byte[]{102, 116, 121, 112};
        l = new byte[]{109, 105, 102, 49};
        m = new byte[]{104, 101, 105, 99};
        n = new byte[]{79, 76, 89, 77, 80, 0};
        o = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        p = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        q = c(101, 88, 73, 102);
        r = c(73, 72, 68, 82);
        s = c(73, 69, 78, 68);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        e = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        jba[] jbaVarArr = {new jba("NewSubfileType", 254, 4), new jba("SubfileType", 255, 4), new jba("ImageWidth", 256, 3, 4), new jba("ImageLength", 257, 3, 4), new jba("BitsPerSample", 258, 3), new jba("Compression", 259, 3), new jba("PhotometricInterpretation", 262, 3), new jba("ImageDescription", 270, 2), new jba("Make", 271, 2), new jba("Model", 272, 2), new jba("StripOffsets", 273, 3, 4), new jba("Orientation", 274, 3), new jba("SamplesPerPixel", 277, 3), new jba("RowsPerStrip", 278, 3, 4), new jba("StripByteCounts", 279, 3, 4), new jba("XResolution", 282, 5), new jba("YResolution", 283, 5), new jba("PlanarConfiguration", 284, 3), new jba("ResolutionUnit", 296, 3), new jba("TransferFunction", 301, 3), new jba("Software", 305, 2), new jba("DateTime", 306, 2), new jba("Artist", 315, 2), new jba("WhitePoint", 318, 5), new jba("PrimaryChromaticities", 319, 5), new jba("SubIFDPointer", 330, 4), new jba("JPEGInterchangeFormat", 513, 4), new jba("JPEGInterchangeFormatLength", 514, 4), new jba("YCbCrCoefficients", 529, 5), new jba("YCbCrSubSampling", 530, 3), new jba("YCbCrPositioning", 531, 3), new jba("ReferenceBlackWhite", 532, 5), new jba("Copyright", 33432, 2), new jba("ExifIFDPointer", 34665, 4), new jba("GPSInfoIFDPointer", 34853, 4), new jba("SensorTopBorder", 4, 4), new jba("SensorLeftBorder", 5, 4), new jba("SensorBottomBorder", 6, 4), new jba("SensorRightBorder", 7, 4), new jba("ISO", 23, 3), new jba("JpgFromRaw", 46, 7), new jba("Xmp", 700, 1)};
        N = jbaVarArr;
        jba[] jbaVarArr2 = {new jba("ExposureTime", 33434, 5), new jba("FNumber", 33437, 5), new jba("ExposureProgram", 34850, 3), new jba("SpectralSensitivity", 34852, 2), new jba("PhotographicSensitivity", 34855, 3), new jba("OECF", 34856, 7), new jba("SensitivityType", 34864, 3), new jba("StandardOutputSensitivity", 34865, 4), new jba("RecommendedExposureIndex", 34866, 4), new jba("ISOSpeed", 34867, 4), new jba("ISOSpeedLatitudeyyy", 34868, 4), new jba("ISOSpeedLatitudezzz", 34869, 4), new jba("ExifVersion", 36864, 2), new jba("DateTimeOriginal", 36867, 2), new jba("DateTimeDigitized", 36868, 2), new jba("OffsetTime", 36880, 2), new jba("OffsetTimeOriginal", 36881, 2), new jba("OffsetTimeDigitized", 36882, 2), new jba("ComponentsConfiguration", 37121, 7), new jba("CompressedBitsPerPixel", 37122, 5), new jba("ShutterSpeedValue", 37377, 10), new jba("ApertureValue", 37378, 5), new jba("BrightnessValue", 37379, 10), new jba("ExposureBiasValue", 37380, 10), new jba("MaxApertureValue", 37381, 5), new jba("SubjectDistance", 37382, 5), new jba("MeteringMode", 37383, 3), new jba("LightSource", 37384, 3), new jba("Flash", 37385, 3), new jba("FocalLength", 37386, 5), new jba("SubjectArea", 37396, 3), new jba("MakerNote", 37500, 7), new jba("UserComment", 37510, 7), new jba("SubSecTime", 37520, 2), new jba("SubSecTimeOriginal", 37521, 2), new jba("SubSecTimeDigitized", 37522, 2), new jba("FlashpixVersion", 40960, 7), new jba("ColorSpace", 40961, 3), new jba("PixelXDimension", 40962, 3, 4), new jba("PixelYDimension", 40963, 3, 4), new jba("RelatedSoundFile", 40964, 2), new jba("InteroperabilityIFDPointer", 40965, 4), new jba("FlashEnergy", 41483, 5), new jba("SpatialFrequencyResponse", 41484, 7), new jba("FocalPlaneXResolution", 41486, 5), new jba("FocalPlaneYResolution", 41487, 5), new jba("FocalPlaneResolutionUnit", 41488, 3), new jba("SubjectLocation", 41492, 3), new jba("ExposureIndex", 41493, 5), new jba("SensingMethod", 41495, 3), new jba("FileSource", 41728, 7), new jba("SceneType", 41729, 7), new jba("CFAPattern", 41730, 7), new jba("CustomRendered", 41985, 3), new jba("ExposureMode", 41986, 3), new jba("WhiteBalance", 41987, 3), new jba("DigitalZoomRatio", 41988, 5), new jba("FocalLengthIn35mmFilm", 41989, 3), new jba("SceneCaptureType", 41990, 3), new jba("GainControl", 41991, 3), new jba("Contrast", 41992, 3), new jba("Saturation", 41993, 3), new jba("Sharpness", 41994, 3), new jba("DeviceSettingDescription", 41995, 7), new jba("SubjectDistanceRange", 41996, 3), new jba("ImageUniqueID", 42016, 2), new jba("CameraOwnerName", 42032, 2), new jba("BodySerialNumber", 42033, 2), new jba("LensSpecification", 42034, 5), new jba("LensMake", 42035, 2), new jba("LensModel", 42036, 2), new jba("Gamma", 42240, 5), new jba("DNGVersion", 50706, 1), new jba("DefaultCropSize", 50720, 3, 4)};
        O = jbaVarArr2;
        jba[] jbaVarArr3 = {new jba("GPSVersionID", 0, 1), new jba("GPSLatitudeRef", 1, 2), new jba("GPSLatitude", 2, 5, 10), new jba("GPSLongitudeRef", 3, 2), new jba("GPSLongitude", 4, 5, 10), new jba("GPSAltitudeRef", 5, 1), new jba("GPSAltitude", 6, 5), new jba("GPSTimeStamp", 7, 5), new jba("GPSSatellites", 8, 2), new jba("GPSStatus", 9, 2), new jba("GPSMeasureMode", 10, 2), new jba("GPSDOP", 11, 5), new jba("GPSSpeedRef", 12, 2), new jba("GPSSpeed", 13, 5), new jba("GPSTrackRef", 14, 2), new jba("GPSTrack", 15, 5), new jba("GPSImgDirectionRef", 16, 2), new jba("GPSImgDirection", 17, 5), new jba("GPSMapDatum", 18, 2), new jba("GPSDestLatitudeRef", 19, 2), new jba("GPSDestLatitude", 20, 5), new jba("GPSDestLongitudeRef", 21, 2), new jba("GPSDestLongitude", 22, 5), new jba("GPSDestBearingRef", 23, 2), new jba("GPSDestBearing", 24, 5), new jba("GPSDestDistanceRef", 25, 2), new jba("GPSDestDistance", 26, 5), new jba("GPSProcessingMethod", 27, 7), new jba("GPSAreaInformation", 28, 7), new jba("GPSDateStamp", 29, 2), new jba("GPSDifferential", 30, 3), new jba("GPSHPositioningError", 31, 5)};
        P = jbaVarArr3;
        jba[] jbaVarArr4 = {new jba("InteroperabilityIndex", 1, 2)};
        Q = jbaVarArr4;
        jba[] jbaVarArr5 = {new jba("NewSubfileType", 254, 4), new jba("SubfileType", 255, 4), new jba("ThumbnailImageWidth", 256, 3, 4), new jba("ThumbnailImageLength", 257, 3, 4), new jba("BitsPerSample", 258, 3), new jba("Compression", 259, 3), new jba("PhotometricInterpretation", 262, 3), new jba("ImageDescription", 270, 2), new jba("Make", 271, 2), new jba("Model", 272, 2), new jba("StripOffsets", 273, 3, 4), new jba("ThumbnailOrientation", 274, 3), new jba("SamplesPerPixel", 277, 3), new jba("RowsPerStrip", 278, 3, 4), new jba("StripByteCounts", 279, 3, 4), new jba("XResolution", 282, 5), new jba("YResolution", 283, 5), new jba("PlanarConfiguration", 284, 3), new jba("ResolutionUnit", 296, 3), new jba("TransferFunction", 301, 3), new jba("Software", 305, 2), new jba("DateTime", 306, 2), new jba("Artist", 315, 2), new jba("WhitePoint", 318, 5), new jba("PrimaryChromaticities", 319, 5), new jba("SubIFDPointer", 330, 4), new jba("JPEGInterchangeFormat", 513, 4), new jba("JPEGInterchangeFormatLength", 514, 4), new jba("YCbCrCoefficients", 529, 5), new jba("YCbCrSubSampling", 530, 3), new jba("YCbCrPositioning", 531, 3), new jba("ReferenceBlackWhite", 532, 5), new jba("Copyright", 33432, 2), new jba("ExifIFDPointer", 34665, 4), new jba("GPSInfoIFDPointer", 34853, 4), new jba("DNGVersion", 50706, 1), new jba("DefaultCropSize", 50720, 3, 4)};
        R = jbaVarArr5;
        S = new jba("StripOffsets", 273, 3);
        jba[] jbaVarArr6 = {new jba("ThumbnailImage", 256, 7), new jba("CameraSettingsIFDPointer", 8224, 4), new jba("ImageProcessingIFDPointer", 8256, 4)};
        T = jbaVarArr6;
        jba[] jbaVarArr7 = {new jba("PreviewImageStart", 257, 4), new jba("PreviewImageLength", 258, 4)};
        U = jbaVarArr7;
        jba[] jbaVarArr8 = {new jba("AspectFrame", 4371, 3)};
        V = jbaVarArr8;
        jba[] jbaVarArr9 = {new jba("ColorSpace", 55, 3)};
        W = jbaVarArr9;
        j = new jba[][]{jbaVarArr, jbaVarArr2, jbaVarArr3, jbaVarArr4, jbaVarArr5, jbaVarArr, jbaVarArr6, jbaVarArr7, jbaVarArr8, jbaVarArr9};
        X = new jba[]{new jba("SubIFDPointer", 330, 4), new jba("ExifIFDPointer", 34665, 4), new jba("GPSInfoIFDPointer", 34853, 4), new jba("InteroperabilityIFDPointer", 40965, 4), new jba("CameraSettingsIFDPointer", 8224, 1), new jba("ImageProcessingIFDPointer", 8256, 1)};
        y = new HashMap[10];
        z = new HashMap[10];
        A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        B = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        g = forName;
        h = "Exif\u0000\u0000".getBytes(forName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            jba[][] jbaVarArr10 = j;
            int length = jbaVarArr10.length;
            if (i < 10) {
                y[i] = new HashMap();
                z[i] = new HashMap();
                for (jba jbaVar : jbaVarArr10[i]) {
                    y[i].put(Integer.valueOf(jbaVar.b), jbaVar);
                    z[i].put(jbaVar.d, jbaVar);
                }
                i++;
            } else {
                jba[] jbaVarArr11 = X;
                Integer valueOf = Integer.valueOf(jbaVarArr11[0].b);
                HashMap hashMap = B;
                hashMap.put(valueOf, 5);
                hashMap.put(Integer.valueOf(jbaVarArr11[1].b), 1);
                hashMap.put(Integer.valueOf(jbaVarArr11[2].b), 2);
                hashMap.put(Integer.valueOf(jbaVarArr11[3].b), 3);
                hashMap.put(Integer.valueOf(jbaVarArr11[4].b), 7);
                hashMap.put(Integer.valueOf(jbaVarArr11[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public cdl(InputStream inputStream) {
        int length = j.length;
        this.G = new HashMap[10];
        this.H = new HashSet(10);
        this.i = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    cdm.a(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.E = null;
                    this.D = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.E = null;
            this.D = null;
        }
        j(inputStream);
    }

    private static int c(int i, int i2, int i3, int i4) {
        return ((i & 255) << 24) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255);
    }

    private final void d() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.G[0].put("DateTime", cdj.b(b2));
        }
        if (b("ImageWidth") == null) {
            this.G[0].put("ImageWidth", cdj.c(0L, this.i));
        }
        if (b("ImageLength") == null) {
            this.G[0].put("ImageLength", cdj.c(0L, this.i));
        }
        if (b("Orientation") == null) {
            this.G[0].put("Orientation", cdj.c(0L, this.i));
        }
        if (b("LightSource") == null) {
            this.G[1].put("LightSource", cdj.c(0L, this.i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:            r20.c = r19.i;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011a, code lost:            return;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104 A[LOOP:0: B:6:0x001e->B:23:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(defpackage.cdi r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdl.e(cdi, int, int):void");
    }

    private final void f(cdi cdiVar) {
        cdiVar.c = ByteOrder.BIG_ENDIAN;
        int i = cdiVar.b;
        int length = p.length;
        cdiVar.b(8);
        while (true) {
            try {
                int readInt = cdiVar.readInt();
                int readInt2 = cdiVar.readInt();
                int i2 = cdiVar.b - i;
                if (i2 == 16) {
                    if (readInt2 == r) {
                        i2 = 16;
                    } else {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                }
                if (readInt2 == s) {
                    return;
                }
                if (readInt2 == q) {
                    this.J = i2;
                    byte[] bArr = new byte[readInt];
                    cdiVar.readFully(bArr);
                    int readInt3 = cdiVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) == readInt3) {
                        l(bArr, 0);
                        p();
                        n(new cdi(bArr));
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                cdiVar.b(readInt + 4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void g(cdi cdiVar) {
        cdiVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        cdiVar.b(4);
        int readInt = cdiVar.readInt() + 8;
        byte[] bArr = u;
        int length2 = bArr.length;
        cdiVar.b(4);
        int length3 = bArr.length;
        int i = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                cdiVar.readFully(bArr2);
                int readInt2 = cdiVar.readInt();
                int i2 = i + 8;
                if (Arrays.equals(v, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    cdiVar.readFully(bArr3);
                    byte[] bArr4 = h;
                    if (bsg.e(bArr3, bArr4)) {
                        int length4 = bArr4.length;
                        bArr3 = Arrays.copyOfRange(bArr3, length4, readInt2 - length4);
                    }
                    this.J = i2;
                    l(bArr3, 0);
                    n(new cdi(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i = i2 + readInt2;
                if (i == readInt) {
                    return;
                }
                if (i <= readInt) {
                    cdiVar.b(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void h(cdi cdiVar, HashMap hashMap) {
        cdj cdjVar = (cdj) hashMap.get("JPEGInterchangeFormat");
        cdj cdjVar2 = (cdj) hashMap.get("JPEGInterchangeFormatLength");
        if (cdjVar != null && cdjVar2 != null) {
            int a2 = cdjVar.a(this.i);
            int a3 = cdjVar2.a(this.i);
            if (this.F == 7) {
                a2 += this.K;
            }
            if (a2 > 0 && a3 > 0 && this.E == null && this.D == null) {
                cdiVar.b(a2);
                cdiVar.readFully(new byte[a3]);
            }
        }
    }

    private final void i(cdi cdiVar, HashMap hashMap) {
        int length;
        int length2;
        byte[] bArr;
        cdj cdjVar = (cdj) hashMap.get("StripOffsets");
        cdj cdjVar2 = (cdj) hashMap.get("StripByteCounts");
        if (cdjVar != null && cdjVar2 != null) {
            long[] f2 = bsg.f(cdjVar.f(this.i));
            long[] f3 = bsg.f(cdjVar2.f(this.i));
            if (f2 != null && (length = f2.length) != 0) {
                if (f3 != null && (length2 = f3.length) != 0) {
                    if (length == length2) {
                        long j2 = 0;
                        for (long j3 : f3) {
                            j2 += j3;
                        }
                        byte[] bArr2 = new byte[(int) j2];
                        this.I = true;
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int length3 = f2.length;
                            if (i < length3) {
                                int i4 = (int) f2[i];
                                int i5 = (int) f3[i];
                                if (i < length3 - 1) {
                                    bArr = bArr2;
                                    if (i4 + i5 != f2[i + 1]) {
                                        this.I = false;
                                    }
                                } else {
                                    bArr = bArr2;
                                }
                                int i6 = i4 - i2;
                                if (i6 >= 0) {
                                    try {
                                        cdiVar.b(i6);
                                        int i7 = i2 + i6;
                                        byte[] bArr3 = new byte[i5];
                                        cdiVar.readFully(bArr3);
                                        i++;
                                        i2 = i7 + i5;
                                        System.arraycopy(bArr3, 0, bArr, i3, i5);
                                        i3 += i5;
                                        bArr2 = bArr;
                                    } catch (EOFException unused) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                if (this.I) {
                                    long j4 = f2[0];
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    }
                } else {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                }
            } else {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bc A[Catch: all -> 0x045b, IOException | UnsupportedOperationException -> 0x0460, IOException | UnsupportedOperationException -> 0x0460, TryCatch #2 {IOException | UnsupportedOperationException -> 0x0460, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0043, B:14:0x0049, B:15:0x0054, B:17:0x0057, B:21:0x005d, B:24:0x0117, B:24:0x0117, B:30:0x0128, B:30:0x0128, B:34:0x0137, B:34:0x0137, B:36:0x0148, B:36:0x0148, B:38:0x0170, B:38:0x0170, B:39:0x0181, B:39:0x0181, B:42:0x01a1, B:42:0x01a1, B:43:0x01b3, B:43:0x01b3, B:45:0x01c1, B:45:0x01c1, B:47:0x01cb, B:47:0x01cb, B:50:0x01cf, B:50:0x01cf, B:52:0x01d7, B:52:0x01d7, B:54:0x01de, B:54:0x01de, B:56:0x01e6, B:56:0x01e6, B:57:0x01ea, B:57:0x01ea, B:58:0x0207, B:58:0x0207, B:59:0x0176, B:59:0x0176, B:61:0x017c, B:61:0x017c, B:62:0x0391, B:62:0x0391, B:68:0x0220, B:68:0x0220, B:70:0x0232, B:70:0x0232, B:71:0x023f, B:71:0x023f, B:74:0x025a, B:74:0x025a, B:75:0x0263, B:75:0x0263, B:76:0x0268, B:76:0x0268, B:81:0x026f, B:81:0x026f, B:120:0x038e, B:132:0x03a7, B:133:0x03aa, B:133:0x03aa, B:78:0x03ab, B:78:0x03ab, B:79:0x03b2, B:79:0x03b2, B:136:0x03b3, B:136:0x03b3, B:138:0x03bc, B:138:0x03bc, B:140:0x03c4, B:140:0x03c4, B:142:0x03cb, B:142:0x03cb, B:144:0x041c, B:144:0x041c, B:148:0x042a, B:148:0x042a, B:146:0x044e, B:146:0x044e, B:151:0x0457, B:151:0x0457, B:161:0x0084, B:161:0x0084, B:169:0x00b0, B:169:0x00b0, B:173:0x00cf, B:173:0x00cf, B:175:0x00d4, B:175:0x00d4, B:180:0x00db, B:180:0x00db, B:182:0x00e0, B:182:0x00e0, B:184:0x00e8, B:184:0x00e8, B:189:0x00ec, B:189:0x00ec, B:191:0x00f1, B:191:0x00f1, B:193:0x00fd, B:193:0x00fd, B:177:0x0103, B:177:0x0103, B:207:0x00c3, B:207:0x00c3, B:208:0x00c6, B:208:0x00c6, B:203:0x00cb, B:203:0x00cb, B:219:0x0094, B:219:0x0094, B:220:0x0097, B:220:0x0097, B:215:0x009c, B:215:0x009c, B:19:0x0109, B:19:0x0109, B:12:0x0110, B:12:0x0110), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00d4 A[Catch: all -> 0x045b, IOException | UnsupportedOperationException -> 0x0460, IOException | UnsupportedOperationException -> 0x0460, TryCatch #2 {IOException | UnsupportedOperationException -> 0x0460, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0043, B:14:0x0049, B:15:0x0054, B:17:0x0057, B:21:0x005d, B:24:0x0117, B:24:0x0117, B:30:0x0128, B:30:0x0128, B:34:0x0137, B:34:0x0137, B:36:0x0148, B:36:0x0148, B:38:0x0170, B:38:0x0170, B:39:0x0181, B:39:0x0181, B:42:0x01a1, B:42:0x01a1, B:43:0x01b3, B:43:0x01b3, B:45:0x01c1, B:45:0x01c1, B:47:0x01cb, B:47:0x01cb, B:50:0x01cf, B:50:0x01cf, B:52:0x01d7, B:52:0x01d7, B:54:0x01de, B:54:0x01de, B:56:0x01e6, B:56:0x01e6, B:57:0x01ea, B:57:0x01ea, B:58:0x0207, B:58:0x0207, B:59:0x0176, B:59:0x0176, B:61:0x017c, B:61:0x017c, B:62:0x0391, B:62:0x0391, B:68:0x0220, B:68:0x0220, B:70:0x0232, B:70:0x0232, B:71:0x023f, B:71:0x023f, B:74:0x025a, B:74:0x025a, B:75:0x0263, B:75:0x0263, B:76:0x0268, B:76:0x0268, B:81:0x026f, B:81:0x026f, B:120:0x038e, B:132:0x03a7, B:133:0x03aa, B:133:0x03aa, B:78:0x03ab, B:78:0x03ab, B:79:0x03b2, B:79:0x03b2, B:136:0x03b3, B:136:0x03b3, B:138:0x03bc, B:138:0x03bc, B:140:0x03c4, B:140:0x03c4, B:142:0x03cb, B:142:0x03cb, B:144:0x041c, B:144:0x041c, B:148:0x042a, B:148:0x042a, B:146:0x044e, B:146:0x044e, B:151:0x0457, B:151:0x0457, B:161:0x0084, B:161:0x0084, B:169:0x00b0, B:169:0x00b0, B:173:0x00cf, B:173:0x00cf, B:175:0x00d4, B:175:0x00d4, B:180:0x00db, B:180:0x00db, B:182:0x00e0, B:182:0x00e0, B:184:0x00e8, B:184:0x00e8, B:189:0x00ec, B:189:0x00ec, B:191:0x00f1, B:191:0x00f1, B:193:0x00fd, B:193:0x00fd, B:177:0x0103, B:177:0x0103, B:207:0x00c3, B:207:0x00c3, B:208:0x00c6, B:208:0x00c6, B:203:0x00cb, B:203:0x00cb, B:219:0x0094, B:219:0x0094, B:220:0x0097, B:220:0x0097, B:215:0x009c, B:215:0x009c, B:19:0x0109, B:19:0x0109, B:12:0x0110, B:12:0x0110), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.media.MediaMetadataRetriever] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(java.io.InputStream r18) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdl.j(java.io.InputStream):void");
    }

    private final void k(cdi cdiVar) {
        ByteOrder v2 = v(cdiVar);
        this.i = v2;
        cdiVar.c = v2;
        int readUnsignedShort = cdiVar.readUnsignedShort();
        int i = this.F;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
        }
        int readInt = cdiVar.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                cdiVar.b(i2);
                return;
            }
            return;
        }
        throw new IOException(a.ae(readInt, "Invalid first Ifd offset: "));
    }

    private final void l(byte[] bArr, int i) {
        cdi cdiVar = new cdi(bArr, (byte[]) null);
        k(cdiVar);
        s(cdiVar, i);
    }

    private final void m(int i, String str, String str2) {
        if (!this.G[i].isEmpty() && this.G[i].get(str) != null) {
            HashMap hashMap = this.G[i];
            hashMap.put(str2, (cdj) hashMap.get(str));
            this.G[i].remove(str);
        }
    }

    private final void n(cdi cdiVar) {
        cdj cdjVar;
        HashMap hashMap = this.G[4];
        cdj cdjVar2 = (cdj) hashMap.get("Compression");
        if (cdjVar2 != null) {
            int a2 = cdjVar2.a(this.i);
            if (a2 != 1) {
                if (a2 != 6) {
                    if (a2 != 7) {
                        return;
                    }
                } else {
                    h(cdiVar, hashMap);
                    return;
                }
            }
            cdj cdjVar3 = (cdj) hashMap.get("BitsPerSample");
            if (cdjVar3 != null) {
                int[] iArr = (int[]) cdjVar3.f(this.i);
                int[] iArr2 = a;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.F == 3 && (cdjVar = (cdj) hashMap.get("PhotometricInterpretation")) != null) {
                        int a3 = cdjVar.a(this.i);
                        if (a3 == 1) {
                            if (!Arrays.equals(iArr, b)) {
                                return;
                            }
                        } else if (a3 != 6 || !Arrays.equals(iArr, iArr2)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                i(cdiVar, hashMap);
                return;
            }
            return;
        }
        h(cdiVar, hashMap);
    }

    private final void o(int i, int i2) {
        if (!this.G[i].isEmpty() && !this.G[i2].isEmpty()) {
            cdj cdjVar = (cdj) this.G[i].get("ImageLength");
            cdj cdjVar2 = (cdj) this.G[i].get("ImageWidth");
            cdj cdjVar3 = (cdj) this.G[i2].get("ImageLength");
            cdj cdjVar4 = (cdj) this.G[i2].get("ImageWidth");
            if (cdjVar != null && cdjVar2 != null && cdjVar3 != null && cdjVar4 != null) {
                int a2 = cdjVar.a(this.i);
                int a3 = cdjVar2.a(this.i);
                int a4 = cdjVar3.a(this.i);
                int a5 = cdjVar4.a(this.i);
                if (a2 < a4 && a3 < a5) {
                    HashMap[] hashMapArr = this.G;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    private final void p() {
        o(0, 5);
        o(0, 4);
        o(5, 4);
        cdj cdjVar = (cdj) this.G[1].get("PixelXDimension");
        cdj cdjVar2 = (cdj) this.G[1].get("PixelYDimension");
        if (cdjVar != null && cdjVar2 != null) {
            this.G[0].put("ImageWidth", cdjVar);
            this.G[0].put("ImageLength", cdjVar2);
        }
        if (this.G[4].isEmpty() && q(this.G[5])) {
            HashMap[] hashMapArr = this.G;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        q(this.G[4]);
        m(0, "ThumbnailOrientation", "Orientation");
        m(0, "ThumbnailImageLength", "ImageLength");
        m(0, "ThumbnailImageWidth", "ImageWidth");
        m(5, "ThumbnailOrientation", "Orientation");
        m(5, "ThumbnailImageLength", "ImageLength");
        m(5, "ThumbnailImageWidth", "ImageWidth");
        m(4, "Orientation", "ThumbnailOrientation");
        m(4, "ImageLength", "ThumbnailImageLength");
        m(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean q(HashMap hashMap) {
        cdj cdjVar = (cdj) hashMap.get("ImageLength");
        cdj cdjVar2 = (cdj) hashMap.get("ImageWidth");
        if (cdjVar != null && cdjVar2 != null) {
            int a2 = cdjVar.a(this.i);
            int a3 = cdjVar2.a(this.i);
            if (a2 <= 512 && a3 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void r(cdi cdiVar) {
        cdj cdjVar;
        k(cdiVar);
        s(cdiVar, 0);
        t(cdiVar, 0);
        t(cdiVar, 5);
        t(cdiVar, 4);
        p();
        if (this.F == 8 && (cdjVar = (cdj) this.G[1].get("MakerNote")) != null) {
            cdi cdiVar2 = new cdi(cdjVar.d, (byte[]) null);
            cdiVar2.c = this.i;
            cdiVar2.b(6);
            s(cdiVar2, 9);
            cdj cdjVar2 = (cdj) this.G[9].get("ColorSpace");
            if (cdjVar2 != null) {
                this.G[1].put("ColorSpace", cdjVar2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0064, code lost:            if (r7 != 9) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0068, code lost:            if (r10 != 8) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x005e, code lost:            if (r10 != 3) goto L25;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(defpackage.cdi r22, int r23) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdl.s(cdi, int):void");
    }

    private final void t(cdi cdiVar, int i) {
        cdj e2;
        cdj e3;
        cdj cdjVar = (cdj) this.G[i].get("DefaultCropSize");
        cdj cdjVar2 = (cdj) this.G[i].get("SensorTopBorder");
        cdj cdjVar3 = (cdj) this.G[i].get("SensorLeftBorder");
        cdj cdjVar4 = (cdj) this.G[i].get("SensorBottomBorder");
        cdj cdjVar5 = (cdj) this.G[i].get("SensorRightBorder");
        if (cdjVar != null) {
            if (cdjVar.a == 5) {
                cdk[] cdkVarArr = (cdk[]) cdjVar.f(this.i);
                if (cdkVarArr != null && cdkVarArr.length == 2) {
                    e2 = cdj.d(cdkVarArr[0], this.i);
                    e3 = cdj.d(cdkVarArr[1], this.i);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(cdkVarArr))));
                    return;
                }
            } else {
                int[] iArr = (int[]) cdjVar.f(this.i);
                if (iArr != null && iArr.length == 2) {
                    e2 = cdj.e(iArr[0], this.i);
                    e3 = cdj.e(iArr[1], this.i);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                }
            }
            this.G[i].put("ImageWidth", e2);
            this.G[i].put("ImageLength", e3);
            return;
        }
        if (cdjVar2 != null && cdjVar3 != null && cdjVar4 != null && cdjVar5 != null) {
            int a2 = cdjVar2.a(this.i);
            int a3 = cdjVar4.a(this.i);
            int a4 = cdjVar5.a(this.i);
            int a5 = cdjVar3.a(this.i);
            if (a3 > a2 && a4 > a5) {
                cdj e4 = cdj.e(a3 - a2, this.i);
                cdj e5 = cdj.e(a4 - a5, this.i);
                this.G[i].put("ImageLength", e4);
                this.G[i].put("ImageWidth", e5);
                return;
            }
            return;
        }
        cdj cdjVar6 = (cdj) this.G[i].get("ImageLength");
        cdj cdjVar7 = (cdj) this.G[i].get("ImageWidth");
        if (cdjVar6 == null || cdjVar7 == null) {
            cdj cdjVar8 = (cdj) this.G[i].get("JPEGInterchangeFormat");
            cdj cdjVar9 = (cdj) this.G[i].get("JPEGInterchangeFormatLength");
            if (cdjVar8 != null && cdjVar9 != null) {
                int a6 = cdjVar8.a(this.i);
                int a7 = cdjVar8.a(this.i);
                cdiVar.c(a6);
                byte[] bArr = new byte[a7];
                cdiVar.readFully(bArr);
                e(new cdi(bArr), a6, i);
            }
        }
    }

    private static final boolean u(byte[] bArr) {
        cdi cdiVar;
        long readInt;
        byte[] bArr2;
        long j2;
        cdi cdiVar2 = null;
        try {
            cdiVar = new cdi(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = cdiVar.readInt();
            bArr2 = new byte[4];
            cdiVar.readFully(bArr2);
        } catch (Exception unused2) {
            cdiVar2 = cdiVar;
            if (cdiVar2 != null) {
                cdiVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            cdiVar2 = cdiVar;
            if (cdiVar2 != null) {
                cdiVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, k)) {
            cdiVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = cdiVar.readLong();
            j2 = 16;
            if (readInt < 16) {
                cdiVar.close();
                return false;
            }
        } else {
            j2 = 8;
        }
        if (readInt > 5000) {
            readInt = 5000;
        }
        long j3 = readInt - j2;
        if (j3 < 8) {
            cdiVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j4 = 0; j4 < (j3 >> 2); j4++) {
            try {
                cdiVar.readFully(bArr3);
                if (j4 != 1) {
                    if (Arrays.equals(bArr3, l)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, m)) {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        cdiVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused3) {
                cdiVar.close();
                return false;
            }
        }
        cdiVar.close();
        return false;
    }

    private static final ByteOrder v(cdi cdiVar) {
        short readShort = cdiVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final cdj a(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            int length = j.length;
            if (i < 10) {
                cdj cdjVar = (cdj) this.G[i].get(str);
                if (cdjVar != null) {
                    return cdjVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final String b(String str) {
        double d2;
        cdj a2 = a(str);
        if (a2 == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i = a2.a;
            if (i != 5 && i != 10) {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + a2.a);
                return null;
            }
            cdk[] cdkVarArr = (cdk[]) a2.f(this.i);
            if (cdkVarArr != null && cdkVarArr.length == 3) {
                cdk cdkVar = cdkVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) cdkVar.a) / ((float) cdkVar.b)));
                cdk cdkVar2 = cdkVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) cdkVar2.a) / ((float) cdkVar2.b)));
                cdk cdkVar3 = cdkVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) cdkVar3.a) / ((float) cdkVar3.b))));
            }
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(cdkVarArr))));
            return null;
        }
        if (A.contains(str)) {
            try {
                Object f2 = a2.f(this.i);
                if (f2 != null) {
                    if (f2 instanceof String) {
                        d2 = Double.parseDouble((String) f2);
                    } else if (f2 instanceof long[]) {
                        long[] jArr = (long[]) f2;
                        if (jArr.length == 1) {
                            d2 = jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof int[]) {
                        int[] iArr = (int[]) f2;
                        if (iArr.length == 1) {
                            d2 = iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof double[]) {
                        double[] dArr = (double[]) f2;
                        if (dArr.length == 1) {
                            d2 = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof cdk[]) {
                        cdk[] cdkVarArr2 = (cdk[]) f2;
                        if (cdkVarArr2.length == 1) {
                            cdk cdkVar4 = cdkVarArr2[0];
                            d2 = cdkVar4.a / cdkVar4.b;
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d2);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return a2.g(this.i);
    }
}

package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.AudioAttributes;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpl {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:            if (r12.size() <= 0) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:            r0 = new defpackage.elo((java.util.List) r12, (java.util.List) r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017d, code lost:            if (r0 == null) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018f, code lost:            if (r13 == 1) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0192, code lost:            if (r13 == 2) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0194, code lost:            r15 = r23;        r1 = new android.graphics.LinearGradient(r14, r15, r16, r17, (int[]) r0.a, (float[]) r0.b, defpackage.bph.b(r9));     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01e3, code lost:            r0 = new defpackage.kvu(r1, null, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ad, code lost:            r1 = new android.graphics.SweepGradient(r22, r5, (int[]) r0.a, (float[]) r0.b);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c6, code lost:            if (r21 <= 0.0f) goto L74;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c8, code lost:            r1 = new android.graphics.RadialGradient(r22, r5, r21, (int[]) r0.a, (float[]) r0.b, defpackage.bph.b(r9));     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:            throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:            if (r18 == false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:            r0 = new defpackage.elo(r8, r3, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:            r0 = new defpackage.elo(r8, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:            r0 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.kvu A(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpl.A(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):kvu");
    }

    public static AudioAttributes.Builder a() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }

    public static AudioAttributes e(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!j(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, int i) {
        if (!j(xmlPullParser, "interpolator")) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static TypedValue m(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!j(xmlPullParser, "value")) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static final cxa n(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT >= 28 && bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    int[] iArr = new int[readInt];
                    for (int i = 0; i < readInt; i++) {
                        iArr[i] = objectInputStream.readInt();
                    }
                    int readInt2 = objectInputStream.readInt();
                    int[] iArr2 = new int[readInt2];
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        iArr2[i2] = objectInputStream.readInt();
                    }
                    cxa b = cwy.a.b(iArr2, iArr);
                    mjo.r(objectInputStream, null);
                    mjo.r(byteArrayInputStream, null);
                    return b;
                } finally {
                }
            } finally {
            }
        } else {
            return new cxa((Object) null);
        }
    }

    public static final Set o(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new cpk(parse, readBoolean));
                    }
                    mjo.r(objectInputStream, null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            mjo.r(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mjo.r(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static final byte[] p(cxa cxaVar) {
        Object obj;
        int[] am;
        int[] am2;
        if (Build.VERSION.SDK_INT >= 28 && (obj = cxaVar.a) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        am = cwz.a.b((NetworkRequest) obj);
                    } else {
                        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < 9; i++) {
                            int i2 = iArr[i];
                            if (cwy.a.d((NetworkRequest) obj, i2)) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                        am = mkm.am(arrayList);
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        am2 = cwz.a.a((NetworkRequest) obj);
                    } else {
                        int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < 29; i3++) {
                            int i4 = iArr2[i3];
                            if (cwy.a.c((NetworkRequest) obj, i4)) {
                                arrayList2.add(Integer.valueOf(i4));
                            }
                        }
                        am2 = mkm.am(arrayList2);
                    }
                    objectOutputStream.writeInt(am.length);
                    for (int i5 : am) {
                        objectOutputStream.writeInt(i5);
                    }
                    objectOutputStream.writeInt(am2.length);
                    for (int i6 : am2) {
                        objectOutputStream.writeInt(i6);
                    }
                    mjo.r(objectOutputStream, null);
                    mjo.r(byteArrayOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } else {
            return new byte[0];
        }
    }

    public static final byte[] q(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    cpk cpkVar = (cpk) it.next();
                    objectOutputStream.writeUTF(cpkVar.a.toString());
                    objectOutputStream.writeBoolean(cpkVar.b);
                }
                mjo.r(objectOutputStream, null);
                mjo.r(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int r(int i) {
        if (i != 0) {
            if (i - 1 != 0) {
                return 1;
            }
            return 0;
        }
        throw null;
    }

    public static final int s(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 4;
                        if (i2 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + ((Object) boz.c(i)) + " to int");
                        }
                    }
                }
            }
            return i3;
        }
        return 0;
    }

    public static final int t(int i) {
        if (i != 0) {
            if (i - 1 != 0) {
                return 1;
            }
            return 0;
        }
        throw null;
    }

    public static final int u(int i) {
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        i3 = 3;
                        if (i2 != 3) {
                            i3 = 4;
                            if (i2 != 4) {
                                return 5;
                            }
                        }
                    }
                }
                return i3;
            }
            return 0;
        }
        throw null;
    }

    public static final int v(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.am(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(a.am(i, "Could not convert ", " to NetworkType"));
    }

    public static final int x(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.am(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int y(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(a.am(i, "Could not convert ", " to State"));
    }

    public static void z(cwo cwoVar, String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            elo eloVar = new elo((String) it.next(), str);
            cwr cwrVar = (cwr) cwoVar;
            cwrVar.a.l();
            cwrVar.a.m();
            try {
                ((cwr) cwoVar).b.b(eloVar);
                ((cwr) cwoVar).a.p();
            } finally {
                cwrVar.a.n();
            }
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afz {
    public static final int a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int b(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int c(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int d(int[] iArr, int i) {
        return iArr[i * 5];
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int i3 = i(arrayList, i, i2);
        if (i3 >= 0) {
            return i3;
        }
        return -(i3 + 1);
    }

    public static final int f(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int g(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + a(iArr[i2 + 1] >> 30);
    }

    public static final int h(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final int i(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((aav) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int a = mpd.a(i5, i);
            if (a < 0) {
                i3 = i4 + 1;
            } else if (a > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final int j(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + a(iArr[i2 + 1] >> 28);
    }

    public static final aav k(ArrayList arrayList, int i, int i2) {
        int i3 = i(arrayList, i, i2);
        if (i3 >= 0) {
            return (aav) arrayList.get(i3);
        }
        return null;
    }

    public static final void l() {
        throw new ConcurrentModificationException();
    }

    public static final void m(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    public static final void n(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        abr.m(z);
        iArr[(i * 5) + 3] = i2;
    }

    public static final void o(int[] iArr, int i, int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        }
        abr.m(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void p(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    public static final boolean q(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean r(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean s(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean t(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean u(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean v(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }
}

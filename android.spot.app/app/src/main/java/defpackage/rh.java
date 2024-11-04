package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.compose.ui.draw.DrawBehindElement;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rh {
    public static KeyguardManager a(Context context) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) KeyguardManager.class);
        return (KeyguardManager) systemService;
    }

    public static boolean b(KeyguardManager keyguardManager) {
        boolean isDeviceSecure;
        isDeviceSecure = keyguardManager.isDeviceSecure();
        return isDeviceSecure;
    }

    public static final void c(aox aoxVar, moh mohVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        abi b = abiVar.b(-932836462);
        if (i5 == 0) {
            if (true != b.B(aoxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.D(mohVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && b.G()) {
            b.r();
        } else {
            aox a = aoxVar.a(new DrawBehindElement(mohVar));
            xs xsVar = xs.c;
            int a2 = abd.a(b);
            aox e = de.e(b, a);
            abp abpVar = (abp) b;
            aek L = abpVar.L();
            int i6 = axu.a;
            b.v();
            if (abpVar.x) {
                b.k(new xr(2));
            } else {
                b.x();
            }
            agx.a(b, xsVar, axt.d);
            agx.a(b, L, axt.c);
            agx.a(b, e, axt.b);
            mol molVar = axt.e;
            if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                abpVar.Z(valueOf);
                b.i(valueOf, molVar);
            }
            b.n();
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new xb(aoxVar, mohVar, i, 0);
        }
    }

    public static final long d(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                return i2 | (i << 32);
            }
            throw new IllegalArgumentException(a.ak((byte) 93, i2, i, "end cannot be negative. [start: ", ", end: "));
        }
        throw new IllegalArgumentException(a.ak((byte) 93, i2, i, "start cannot be negative. [start: ", ", end: "));
    }

    public static final int e(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            char c = 1;
            if (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                bfy bfyVar = (bfy) list.get(i3);
                if (bfyVar.a <= i) {
                    if (bfyVar.b <= i) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (c < 0) {
                    i2 = i3 + 1;
                } else if (c > 0) {
                    size = i3 - 1;
                } else {
                    return i3;
                }
            } else {
                return -(i2 + 1);
            }
        }
    }

    public static final int f(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            char c = 1;
            if (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                bfy bfyVar = (bfy) list.get(i3);
                if (bfyVar.c <= i) {
                    if (bfyVar.d <= i) {
                        c = 65535;
                    } else {
                        c = 0;
                    }
                }
                if (c < 0) {
                    i2 = i3 + 1;
                } else if (c > 0) {
                    size = i3 - 1;
                } else {
                    return i3;
                }
            } else {
                return -(i2 + 1);
            }
        }
    }
}

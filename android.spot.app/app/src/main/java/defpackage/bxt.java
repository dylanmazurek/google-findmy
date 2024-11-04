package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxt extends bxy {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    brq b;
    private brq[] j;
    private brq k;
    private bya l;

    public bxt(bya byaVar, WindowInsets windowInsets) {
        super(byaVar);
        this.k = null;
        this.a = windowInsets;
    }

    private brq t(int i2, boolean z) {
        brq brqVar = brq.a;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i2 & i3) != 0) {
                brqVar = brq.b(brqVar, b(i3, false));
            }
        }
        return brqVar;
    }

    private brq u() {
        bya byaVar = this.l;
        if (byaVar != null) {
            return byaVar.g();
        }
        return brq.a;
    }

    private brq v(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!c) {
                w();
            }
            Method method = f;
            if (method != null && g != null && h != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) h.get(i.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return brq.c(rect);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void w() {
        try {
            f = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        c = true;
    }

    @Override // defpackage.bxy
    public brq a(int i2) {
        return t(i2, false);
    }

    protected brq b(int i2, boolean z) {
        brq brqVar;
        buv o;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 != 1) {
            brq brqVar2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    bya byaVar = this.l;
                                    if (byaVar != null) {
                                        o = byaVar.b.o();
                                    } else {
                                        o = o();
                                    }
                                    if (o != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i3 = buu.b(o.a);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i4 = buu.d(o.a);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i5 = buu.c(o.a);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i6 = buu.a(o.a);
                                        }
                                        return brq.d(i3, i4, i5, i6);
                                    }
                                }
                            } else {
                                return s();
                            }
                        } else {
                            return q();
                        }
                    } else {
                        return r();
                    }
                } else {
                    brq[] brqVarArr = this.j;
                    if (brqVarArr != null) {
                        brqVar2 = brqVarArr[bqr.d(8)];
                    }
                    if (brqVar2 != null) {
                        return brqVar2;
                    }
                    brq c2 = c();
                    brq u = u();
                    int i7 = c2.e;
                    if (i7 > u.e || ((brqVar = this.b) != null && !brqVar.equals(brq.a) && (i7 = this.b.e) > u.e)) {
                        return brq.d(0, 0, 0, i7);
                    }
                }
                return brq.a;
            }
            brq c3 = c();
            bya byaVar2 = this.l;
            if (byaVar2 != null) {
                brqVar2 = byaVar2.g();
            }
            int i8 = c3.e;
            if (brqVar2 != null) {
                i8 = Math.min(i8, brqVar2.e);
            }
            return brq.d(c3.b, 0, c3.d, i8);
        }
        return brq.d(0, c().c, 0, 0);
    }

    @Override // defpackage.bxy
    public final brq c() {
        if (this.k == null) {
            WindowInsets windowInsets = this.a;
            this.k = brq.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.k;
    }

    @Override // defpackage.bxy
    public bya d(int i2, int i3, int i4, int i5) {
        bxs bxpVar;
        bya m = bya.m(this.a);
        if (Build.VERSION.SDK_INT >= 30) {
            bxpVar = new bxr(m);
        } else if (Build.VERSION.SDK_INT >= 29) {
            bxpVar = new bxq(m);
        } else {
            bxpVar = new bxp(m);
        }
        bxpVar.c(bya.h(c(), i2, i3, i4, i5));
        bxpVar.b(bya.h(j(), i2, i3, i4, i5));
        return bxpVar.a();
    }

    @Override // defpackage.bxy
    public void e(View view) {
        brq v = v(view);
        if (v == null) {
            v = brq.a;
        }
        g(v);
    }

    @Override // defpackage.bxy
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.b, ((bxt) obj).b);
    }

    @Override // defpackage.bxy
    public void f(brq[] brqVarArr) {
        this.j = brqVarArr;
    }

    public void g(brq brqVar) {
        this.b = brqVar;
    }

    @Override // defpackage.bxy
    public void h(bya byaVar) {
        this.l = byaVar;
    }

    @Override // defpackage.bxy
    public boolean i() {
        return this.a.isRound();
    }
}

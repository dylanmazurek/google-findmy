package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.adm.R;
import java.io.Closeable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class a {
    public static /* synthetic */ int B(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int C(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int D(int i) {
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
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static /* synthetic */ Object E(Object obj) {
        lfa lfaVar = (lfa) obj;
        int ordinal = lfaVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return gvk.f;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(lfaVar.toString()));
                        }
                        return gvk.e;
                    }
                    return gvk.d;
                }
                return gvk.c;
            }
            return gvk.b;
        }
        return gvk.a;
    }

    public static /* synthetic */ Object F(Object obj) {
        gvk gvkVar = (gvk) obj;
        int ordinal = gvkVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return lfa.CHROME_OS;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(gvkVar.toString()));
                        }
                        return lfa.BATTLESTAR;
                    }
                    return lfa.AUTOMOTIVE;
                }
                return lfa.WEARABLE;
            }
            return lfa.TV;
        }
        return lfa.DEFAULT;
    }

    public static /* synthetic */ int G(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int H(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return 0;
        }
        return 4;
    }

    public static /* synthetic */ int I(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 5;
        }
        return 4;
    }

    public static /* synthetic */ int J(int i) {
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
        if (i != 5) {
            return 0;
        }
        return 6;
    }

    public static /* synthetic */ int K(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int L(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int M(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            default:
                return 0;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
        }
    }

    public static /* synthetic */ void N(int i) {
        if (i != 0) {
        } else {
            throw null;
        }
    }

    public static /* synthetic */ int O(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ boolean P(int i) {
        if (D(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean Q(int i) {
        if (w(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean R(int i) {
        if (G(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean S(int i) {
        if (J(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean T(int i) {
        if (H(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean U(int i) {
        if (L(i) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void V(int i) {
        if (i != 0) {
        } else {
            throw null;
        }
    }

    public static /* synthetic */ String W(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "INVISIBLE";
                }
                return "GONE";
            }
            return "VISIBLE";
        }
        return "REMOVED";
    }

    public static void X(int i, View view, ViewGroup viewGroup) {
        int i2 = i - 1;
        ViewGroup viewGroup2 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (be.Z(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (be.Z(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                    return;
                }
            }
            if (be.Z(2)) {
                Objects.toString(view);
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (be.Z(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (be.Z(2)) {
                Objects.toString(view);
                Objects.toString(viewGroup2);
            }
            viewGroup2.removeView(view);
        }
    }

    public static final int Y(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            throw new IllegalArgumentException(ae(i, "Unknown visibility "));
        }
        return 2;
    }

    public static final int Z(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return Y(view.getVisibility());
    }

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ String aa(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static final cb ab(ViewGroup viewGroup, a aVar) {
        aVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof cb) {
            return (cb) tag;
        }
        cb cbVar = new cb(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cbVar);
        return cbVar;
    }

    public static bfi ac(Context context, ag agVar, boolean z, boolean z2) {
        int i;
        int t;
        boolean z3;
        boolean z4;
        ac acVar = agVar.S;
        int i2 = 0;
        if (acVar == null) {
            i = 0;
        } else {
            i = acVar.f;
        }
        if (z2) {
            if (z) {
                t = agVar.u();
                z3 = true;
                z4 = true;
            } else {
                t = agVar.v();
                z3 = false;
                z4 = false;
            }
        } else if (z) {
            t = agVar.s();
            z3 = true;
            z4 = true;
        } else {
            t = agVar.t();
            z3 = false;
            z4 = false;
        }
        agVar.aj(0, 0, 0, 0);
        ViewGroup viewGroup = agVar.O;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            agVar.O.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = agVar.O;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (t == 0) {
            if (i != 0) {
                if (i != 4097) {
                    if (i != 8194) {
                        if (i != 8197) {
                            if (i != 4099) {
                                if (i != 4100) {
                                    i2 = -1;
                                } else if (z4) {
                                    i2 = aq(context, android.R.attr.activityOpenEnterAnimation);
                                } else {
                                    i2 = aq(context, android.R.attr.activityOpenExitAnimation);
                                }
                            } else if (true != z3) {
                                i2 = R.animator.fragment_fade_exit;
                            } else {
                                i2 = R.animator.fragment_fade_enter;
                            }
                        } else if (z4) {
                            i2 = aq(context, android.R.attr.activityCloseEnterAnimation);
                        } else {
                            i2 = aq(context, android.R.attr.activityCloseExitAnimation);
                        }
                    } else if (true != z3) {
                        i2 = R.animator.fragment_close_exit;
                    } else {
                        i2 = R.animator.fragment_close_enter;
                    }
                } else if (true != z3) {
                    i2 = R.animator.fragment_open_exit;
                } else {
                    i2 = R.animator.fragment_open_enter;
                }
            }
        } else {
            i2 = t;
        }
        if (i2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation != null) {
                        return new bfi(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                if (loadAnimator != null) {
                    return new bfi(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation2 != null) {
                        return new bfi(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String ad(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String ae(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String af(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String ag(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String ah(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String aj(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String ak(byte b, int i, int i2, String str, String str2) {
        return str + i2 + str2 + i + ((char) b);
    }

    public static /* synthetic */ String al(StringBuilder sb, String str, int i, String str2, int i2, aij aijVar) {
        sb.append("Error while pushing ");
        sb.append(aijVar);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i2);
        sb.append(" int arguments (");
        sb.append(str2);
        sb.append(") and ");
        sb.append(i);
        sb.append(" object arguments (");
        sb.append(str);
        sb.append(").");
        return sb.toString();
    }

    public static /* synthetic */ String am(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String an(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String ao(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String ap(long j, String str) {
        return str + j;
    }

    private static int aq(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ boolean b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void d() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object e() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean f() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean g() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ PorterDuff.Mode h(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static /* synthetic */ int i(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static /* synthetic */ boolean j(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ long k(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ int l(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ boolean m(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean n(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object r(Object obj, Object obj2) {
        abi abiVar = (abi) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && abiVar.G()) {
            abiVar.r();
        }
        return mlh.a;
    }

    public static /* synthetic */ int s(int i) {
        return i - 1;
    }

    public static /* synthetic */ void t(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(ad(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void u(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(ad(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void v(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            } else {
                throw new IllegalArgumentException(ad(i2, i, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return 0;
        }
        return 3;
    }

    public static /* synthetic */ int x(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            return 4;
        }
        return 3;
    }

    public static /* synthetic */ int[] y() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ void z(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}

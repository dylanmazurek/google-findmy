package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwn {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    private static ThreadLocal e;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final bvl f = new bvl() { // from class: bvs
        @Override // defpackage.bvl
        public final bur c(bur burVar) {
            int[] iArr = bwn.a;
            return burVar;
        }
    };
    private static final bvx g = new bvx();

    private static void A(int i, View view) {
        List h = h(view);
        for (int i2 = 0; i2 < h.size(); i2++) {
            if (((byi) h.get(i2)).a() == i) {
                h.remove(i2);
                return;
            }
        }
    }

    private static void B(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private static void C(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            if (d) {
                return null;
            }
            if (c == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    d = true;
                    return null;
                }
            }
            Object obj = c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        }
        return bwh.a(view);
    }

    public static buk b(View view) {
        View.AccessibilityDelegate a2 = a(view);
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof buj) {
            return ((buj) a2).a;
        }
        return new buk(a2);
    }

    public static bur c(View view, bur burVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bwj.a(view, burVar);
        }
        bvk bvkVar = (bvk) view.getTag(R.id.tag_on_receive_content_listener);
        if (bvkVar != null) {
            bur a2 = bvkVar.a(view, burVar);
            if (a2 == null) {
                return null;
            }
            return z(view).c(a2);
        }
        return z(view).c(burVar);
    }

    public static bya d(View view, bya byaVar) {
        WindowInsets e2 = byaVar.e();
        if (e2 != null) {
            WindowInsets a2 = bvz.a(view, e2);
            if (!a2.equals(e2)) {
                return bya.n(a2, view);
            }
        }
        return byaVar;
    }

    public static bya e(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bwc.b(view);
        }
        return bwb.g(view);
    }

    public static bya f(View view, bya byaVar) {
        WindowInsets e2 = byaVar.e();
        if (e2 != null) {
            WindowInsets b2 = bvz.b(view, e2);
            if (!b2.equals(e2)) {
                return bya.n(b2, view);
            }
        }
        return byaVar;
    }

    public static CharSequence g(View view) {
        return (CharSequence) new bvu(CharSequence.class).d(view);
    }

    public static List h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void i(View view, byi byiVar) {
        j(view);
        A(byiVar.a(), view);
        h(view).add(byiVar);
        k(view, 0);
    }

    public static void j(View view) {
        buk b2 = b(view);
        if (b2 == null) {
            b2 = new buk();
        }
        q(view, b2);
    }

    public static void k(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (g(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(32);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(g(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            if (true != z) {
                i2 = 2048;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            obtain2.setEventType(i2);
            obtain2.setContentChangeTypes(i);
            if (z) {
                obtain2.getText().add(g(view));
                B(view);
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static void l(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect y = y();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            y.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !y.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            C(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                C((View) parent2);
            }
        }
        if (z && y.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(y);
        }
    }

    public static void m(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect y = y();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            y.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !y.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            C(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                C((View) parent2);
            }
        }
        if (z && y.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(y);
        }
    }

    public static void n(View view, int i) {
        A(i, view);
        k(view, 0);
    }

    public static void o(View view, byi byiVar, CharSequence charSequence, byz byzVar) {
        if (byzVar == null && charSequence == null) {
            n(view, byiVar.a());
        } else {
            i(view, new byi(null, byiVar.n, charSequence, byzVar, byiVar.o));
        }
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            bwh.d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void q(View view, buk bukVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (bukVar == null && (a(view) instanceof buj)) {
            bukVar = new buk();
        }
        B(view);
        if (bukVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = bukVar.A;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void r(View view, CharSequence charSequence) {
        new bvu(CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            bvx bvxVar = g;
            WeakHashMap weakHashMap = bvxVar.a;
            boolean z = false;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(bvxVar);
            if (view.isAttachedToWindow()) {
                bvxVar.a(view);
                return;
            }
            return;
        }
        bvx bvxVar2 = g;
        bvxVar2.a.remove(view);
        view.removeOnAttachStateChangeListener(bvxVar2);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(bvxVar2);
    }

    public static void s(View view, ColorStateList colorStateList) {
        bwb.j(view, colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (bwb.d(view) == null && bwb.e(view) == null) {
                z = false;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static boolean t(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        bwm c2 = bwm.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!bwm.a.isEmpty()) {
                synchronized (bwm.a) {
                    if (c2.b == null) {
                        c2.b = new WeakHashMap();
                    }
                    int size = bwm.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) bwm.a.get(size)).get();
                        if (view2 == null) {
                            bwm.a.remove(size);
                        } else {
                            c2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View b2 = c2.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                c2.a().put(keyCode, new WeakReference(b2));
            }
        }
        if (b2 == null) {
            return false;
        }
        return true;
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        bwm c2 = bwm.c(view);
        WeakReference weakReference = c2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        c2.c = new WeakReference(keyEvent);
        SparseArray a2 = c2.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
            a2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            bwm.d(view2);
            return true;
        }
        return true;
    }

    public static String[] v(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bwj.c(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static bet w(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        bet betVar = (bet) b.get(view);
        if (betVar == null) {
            bet betVar2 = new bet(view);
            b.put(view, betVar2);
            return betVar2;
        }
        return betVar;
    }

    public static void x(View view, bet betVar) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (betVar != null) {
                obj = betVar.a;
            } else {
                obj = null;
            }
            bwd.d(view, ct$$ExternalSyntheticApiModelOutline0.m79m(obj));
        }
    }

    private static Rect y() {
        if (e == null) {
            e = new ThreadLocal();
        }
        Rect rect = (Rect) e.get();
        if (rect == null) {
            rect = new Rect();
            e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static bvl z(View view) {
        if (view instanceof bvl) {
            return (bvl) view;
        }
        return f;
    }
}

package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byi {
    public static final byi a;
    public static final byi b;
    public static final byi c;
    public static final byi d;
    public static final byi e;
    public static final byi f;
    public static final byi g;
    public static final byi h;
    public static final byi i;
    public static final byi j;
    public static final byi k;
    public static final byi l;
    final Object m;
    public final int n;
    public final Class o;
    public final byz p;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction37;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction38;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction39;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction40;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction41;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction42;
        new byi(1);
        new byi(2);
        new byi(4);
        new byi(8);
        a = new byi(16);
        new byi(32);
        b = new byi(64);
        c = new byi(128);
        new byi(256, bys.class);
        new byi(512, bys.class);
        new byi(1024, byt.class);
        new byi(2048, byt.class);
        d = new byi(4096);
        e = new byi(8192);
        new byi(16384);
        new byi(32768);
        new byi(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        new byi(131072, byx.class);
        f = new byi(262144);
        g = new byi(ImageMetadata.LENS_APERTURE);
        h = new byi(ImageMetadata.SHADING_MODE);
        new byi(2097152, byy.class);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction43 = null;
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction42 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            accessibilityAction = accessibilityAction42;
        } else {
            accessibilityAction = null;
        }
        new byi(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction41 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            accessibilityAction2 = accessibilityAction41;
        } else {
            accessibilityAction2 = null;
        }
        i = new byi(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, byv.class);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction40 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            accessibilityAction3 = accessibilityAction40;
        } else {
            accessibilityAction3 = null;
        }
        j = new byi(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction39 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            accessibilityAction4 = accessibilityAction39;
        } else {
            accessibilityAction4 = null;
        }
        new byi(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction38 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            accessibilityAction5 = accessibilityAction38;
        } else {
            accessibilityAction5 = null;
        }
        k = new byi(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            accessibilityAction6 = accessibilityAction37;
        } else {
            accessibilityAction6 = null;
        }
        new byi(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction7 = accessibilityAction36;
        } else {
            accessibilityAction7 = null;
        }
        new byi(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction8 = accessibilityAction35;
        } else {
            accessibilityAction8 = null;
        }
        new byi(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            accessibilityAction9 = accessibilityAction34;
        } else {
            accessibilityAction9 = null;
        }
        new byi(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction10 = accessibilityAction33;
        } else {
            accessibilityAction10 = null;
        }
        new byi(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            accessibilityAction11 = accessibilityAction32;
        } else {
            accessibilityAction11 = null;
        }
        new byi(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction12 = accessibilityAction31;
        } else {
            accessibilityAction12 = null;
        }
        new byi(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, byw.class);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            accessibilityAction13 = accessibilityAction30;
        } else {
            accessibilityAction13 = null;
        }
        new byi(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, byu.class);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction14 = accessibilityAction29;
        } else {
            accessibilityAction14 = null;
        }
        new byi(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction15 = accessibilityAction28;
        } else {
            accessibilityAction15 = null;
        }
        new byi(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction16 = accessibilityAction27;
        } else {
            accessibilityAction16 = null;
        }
        new byi(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction17 = accessibilityAction26;
        } else {
            accessibilityAction17 = null;
        }
        new byi(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction18 = accessibilityAction25;
        } else {
            accessibilityAction18 = null;
        }
        new byi(accessibilityAction18, R.id.ALT, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction19 = accessibilityAction24;
        } else {
            accessibilityAction19 = null;
        }
        new byi(accessibilityAction19, R.id.CTRL, null, null, null);
        if (Build.VERSION.SDK_INT >= 32) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction20 = accessibilityAction23;
        } else {
            accessibilityAction20 = null;
        }
        new byi(accessibilityAction20, R.id.FUNCTION, null, null, null);
        if (Build.VERSION.SDK_INT >= 33) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction21 = accessibilityAction22;
        } else {
            accessibilityAction21 = null;
        }
        new byi(accessibilityAction21, R.id.KEYCODE_0, null, null, null);
        if (Build.VERSION.SDK_INT >= 34) {
            accessibilityAction43 = byl.b();
        }
        l = new byi(accessibilityAction43, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public byi(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.m).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.m).getLabel();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof byi) || !this.m.equals(((byi) obj).m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String g2 = byn.g(this.n);
        if (g2.equals("ACTION_UNKNOWN") && b() != null) {
            g2 = b().toString();
        }
        sb.append(g2);
        return sb.toString();
    }

    private byi(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public byi(Object obj, int i2, CharSequence charSequence, byz byzVar, Class cls) {
        this.n = i2;
        this.p = byzVar;
        this.m = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.o = cls;
    }
}

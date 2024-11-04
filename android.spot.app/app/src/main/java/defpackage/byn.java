package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.adm.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byn {
    public static int a;
    public final AccessibilityNodeInfo b;
    public int c = -1;
    private int d = -1;

    public byn(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static ClickableSpan[] ad(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static final SparseArray ae(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static byn b() {
        return new byn(AccessibilityNodeInfo.obtain());
    }

    public static byn c(Object obj) {
        if (obj != null) {
            return new byn(obj);
        }
        return null;
    }

    public static String g(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case android.support.design.widget.R.styleable.TextInputLayout_endIconTint /* 32 */:
                        return "ACTION_LONG_CLICK";
                    case android.support.design.widget.R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case ImageMetadata.LENS_APERTURE /* 524288 */:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case android.R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    case android.R.id.KEYCODE_3D_MODE:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case android.R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case android.R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case android.R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case android.R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case android.R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case android.R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case android.R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case android.R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case android.R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case android.R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case android.R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case android.R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case android.R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case android.R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case android.R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case android.R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case android.R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void A(CharSequence charSequence) {
        this.b.setError(charSequence);
    }

    public final void B(boolean z) {
        this.b.setFocusable(z);
    }

    public final void C(boolean z) {
        this.b.setFocused(z);
    }

    public final void D(boolean z) {
        if (Build.VERSION.SDK_INT < 28) {
            o(2, z);
        } else {
            this.b.setHeading(z);
        }
    }

    public final void E(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT < 26) {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        } else {
            this.b.setHintText(charSequence);
        }
    }

    public final void F(View view) {
        this.b.setLabelFor(view);
    }

    public final void G(boolean z) {
        this.b.setLongClickable(z);
    }

    public final void H(int i) {
        this.b.setMaxTextLength(i);
    }

    public final void I(int i) {
        this.b.setMovementGranularities(i);
    }

    public final void J(CharSequence charSequence) {
        this.b.setPackageName(charSequence);
    }

    public final void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT < 28) {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        } else {
            this.b.setPaneTitle(charSequence);
        }
    }

    public final void L(View view) {
        this.c = -1;
        this.b.setParent(view);
    }

    public final void M(View view, int i) {
        this.c = i;
        this.b.setParent(view, i);
    }

    public final void N(CharSequence charSequence) {
        this.b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void O(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b.setScreenReaderFocusable(z);
        } else {
            o(1, z);
        }
    }

    public final void P(boolean z) {
        this.b.setScrollable(z);
    }

    public final void Q(View view, int i) {
        this.d = i;
        this.b.setSource(view, i);
    }

    public final void R(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            byj.c(this.b, charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void S(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void T(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.b.setTraversalAfter(view);
        }
    }

    public final void U(boolean z) {
        this.b.setVisibleToUser(z);
    }

    public final boolean V(int i) {
        Bundle a2 = a();
        if (a2 == null || (a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public final boolean W() {
        return this.b.isChecked();
    }

    public final boolean X() {
        return this.b.isClickable();
    }

    public final boolean Y() {
        return this.b.isEnabled();
    }

    public final boolean Z() {
        return this.b.isFocusable();
    }

    public final Bundle a() {
        return this.b.getExtras();
    }

    public final boolean aa() {
        return this.b.isFocused();
    }

    public final boolean ab() {
        return this.b.isPassword();
    }

    public final boolean ac() {
        return this.b.isScrollable();
    }

    public final void af(byi byiVar) {
        this.b.removeAction((AccessibilityNodeInfo.AccessibilityAction) byiVar.m);
    }

    public final void ag() {
        o(67108864, true);
    }

    public final CharSequence d() {
        return this.b.getClassName();
    }

    public final CharSequence e() {
        return this.b.getContentDescription();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof byn)) {
            return false;
        }
        byn bynVar = (byn) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            if (bynVar.b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bynVar.b)) {
            return false;
        }
        if (this.d == bynVar.d && this.c == bynVar.c) {
            return true;
        }
        return false;
    }

    public final CharSequence f() {
        if (!h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            AccessibilityNodeInfo accessibilityNodeInfo = this.b;
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < h.size(); i++) {
                spannableString.setSpan(new byg(((Integer) h4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h.get(i)).intValue(), ((Integer) h2.get(i)).intValue(), ((Integer) h3.get(i)).intValue());
            }
            return spannableString;
        }
        return this.b.getText();
    }

    public final List h(String str) {
        ArrayList<Integer> integerArrayList = this.b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.b.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(int i) {
        this.b.addAction(i);
    }

    public final void j(byi byiVar) {
        this.b.addAction((AccessibilityNodeInfo.AccessibilityAction) byiVar.m);
    }

    public final void k(View view, int i) {
        this.b.addChild(view, i);
    }

    @Deprecated
    public final void l(Rect rect) {
        this.b.getBoundsInParent(rect);
    }

    public final void m(Rect rect) {
        this.b.getBoundsInScreen(rect);
    }

    public final void n(boolean z) {
        this.b.setAccessibilityFocused(z);
    }

    public final void o(int i, boolean z) {
        Bundle a2 = a();
        if (a2 != null) {
            int i2 = a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    public final void p(Rect rect) {
        this.b.setBoundsInParent(rect);
    }

    public final void q(Rect rect) {
        this.b.setBoundsInScreen(rect);
    }

    public final void r(boolean z) {
        this.b.setCheckable(z);
    }

    public final void s(boolean z) {
        this.b.setChecked(z);
    }

    public final void t(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        boolean z;
        CharSequence charSequence3;
        boolean z2;
        boolean V;
        boolean V2;
        List emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        m(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        if (Build.VERSION.SDK_INT >= 34) {
            byl.d(this.b, rect);
        } else {
            Rect rect2 = (Rect) this.b.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.b.getPackageName());
        sb.append("; className: ");
        sb.append(d());
        sb.append("; text: ");
        sb.append(f());
        sb.append("; error: ");
        sb.append(this.b.getError());
        sb.append("; maxTextLength: ");
        sb.append(this.b.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (Build.VERSION.SDK_INT >= 30) {
            charSequence = byj.a(this.b);
        } else {
            charSequence = this.b.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; tooltipText: ");
        if (Build.VERSION.SDK_INT >= 28) {
            charSequence2 = this.b.getTooltipText();
        } else {
            charSequence2 = this.b.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(this.b.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (Build.VERSION.SDK_INT >= 33) {
            string = byk.g(this.b);
        } else {
            string = this.b.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(this.b.isCheckable());
        sb.append("; checked: ");
        sb.append(W());
        sb.append("; focusable: ");
        sb.append(Z());
        sb.append("; focused: ");
        sb.append(aa());
        sb.append("; selected: ");
        sb.append(this.b.isSelected());
        sb.append("; clickable: ");
        sb.append(X());
        sb.append("; longClickable: ");
        sb.append(this.b.isLongClickable());
        sb.append("; contextClickable: ");
        if (Build.VERSION.SDK_INT >= 23) {
            z = this.b.isContextClickable();
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("; enabled: ");
        sb.append(Y());
        sb.append("; password: ");
        sb.append(ab());
        sb.append("; scrollable: " + ac());
        sb.append("; containerTitle: ");
        if (Build.VERSION.SDK_INT >= 34) {
            charSequence3 = byl.c(this.b);
        } else {
            charSequence3 = this.b.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(V(67108864));
        sb.append("; importantForAccessibility: ");
        if (Build.VERSION.SDK_INT >= 24) {
            z2 = this.b.isImportantForAccessibility();
        } else {
            z2 = true;
        }
        sb.append(z2);
        sb.append("; visible: ");
        sb.append(this.b.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (Build.VERSION.SDK_INT >= 33) {
            V = byk.j(this.b);
        } else {
            V = V(8388608);
        }
        sb.append(V);
        sb.append("; accessibilityDataSensitive: ");
        if (Build.VERSION.SDK_INT >= 34) {
            V2 = byl.l(this.b);
        } else {
            V2 = V(64);
        }
        sb.append(V2);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.b.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new byi(actionList.get(i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            byi byiVar = (byi) emptyList.get(i2);
            String g = g(byiVar.a());
            if (g.equals("ACTION_UNKNOWN") && byiVar.b() != null) {
                g = byiVar.b().toString();
            }
            sb.append(g);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(boolean z) {
        this.b.setClickable(z);
    }

    public final void v(Object obj) {
        this.b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((bet) obj).a);
    }

    public final void w(Object obj) {
        this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((bym) obj).a);
    }

    public final void x(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public final void y(boolean z) {
        this.b.setDismissable(z);
    }

    public final void z(boolean z) {
        this.b.setEnabled(z);
    }

    @Deprecated
    public byn(Object obj) {
        this.b = (AccessibilityNodeInfo) obj;
    }
}

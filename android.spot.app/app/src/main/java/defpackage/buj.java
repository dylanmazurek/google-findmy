package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class buj extends View.AccessibilityDelegate {
    final buk a;

    public buj(buk bukVar) {
        this.a = bukVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        byq a = this.a.a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        byn bynVar = new byn(accessibilityNodeInfo);
        Boolean bool = (Boolean) new bvt(Boolean.class).d(view);
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        bynVar.O(z);
        Boolean bool2 = (Boolean) new bvw(Boolean.class).d(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z2 = false;
        }
        bynVar.D(z2);
        bynVar.K(bwn.g(view));
        bynVar.R((CharSequence) new bvv(CharSequence.class).d(view));
        this.a.c(view, bynVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            bynVar.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            bynVar.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            bynVar.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            bynVar.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray ae = byn.ae(view);
            if (ae != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < ae.size(); i2++) {
                    if (((WeakReference) ae.valueAt(i2)).get() == null) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ae.remove(((Integer) arrayList.get(i3)).intValue());
                }
            }
            ClickableSpan[] ad = byn.ad(text);
            if (ad != null && ad.length > 0) {
                bynVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray ae2 = byn.ae(view);
                if (ae2 == null) {
                    ae2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, ae2);
                }
                for (int i4 = 0; i4 < ad.length; i4++) {
                    ClickableSpan clickableSpan = ad[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 < ae2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) ae2.valueAt(i5)).get())) {
                                i = ae2.keyAt(i5);
                                break;
                            }
                            i5++;
                        } else {
                            i = byn.a;
                            byn.a = i + 1;
                            break;
                        }
                    }
                    ae2.put(i, new WeakReference(ad[i4]));
                    ClickableSpan clickableSpan2 = ad[i4];
                    Spanned spanned = (Spanned) text;
                    bynVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    bynVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    bynVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    bynVar.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List N = buk.N(view);
        for (int i6 = 0; i6 < N.size(); i6++) {
            bynVar.j((byi) N.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}

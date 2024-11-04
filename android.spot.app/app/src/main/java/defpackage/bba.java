package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.adm.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bba implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bba(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((aqr) this.a).b(view.getContext());
            return;
        }
        bbj bbjVar = (bbj) this.a;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = bbjVar.e;
        AccessibilityManager accessibilityManager = bbjVar.d;
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        accessibilityManager.addTouchExplorationStateChangeListener(bbjVar.f);
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, muf] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    view.removeOnAttachStateChangeListener(this);
                    this.a.s(null);
                    return;
                }
                Iterator a = moz.S(((View) this.a).getParent(), bww.a).a();
                while (a.hasNext()) {
                    Object obj = (ViewParent) a.next();
                    if (obj instanceof View) {
                        View view2 = (View) obj;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                ((bah) this.a).b();
                return;
            }
            Context context = view.getContext();
            aqr aqrVar = (aqr) this.a;
            if (aqrVar.d) {
                context.getApplicationContext().unregisterComponentCallbacks(aqrVar.f);
                aqrVar.d = false;
            }
            ((aqr) this.a).c.a();
            return;
        }
        bbj bbjVar = (bbj) this.a;
        bbjVar.h.removeCallbacks(bbjVar.s);
        bbj bbjVar2 = (bbj) this.a;
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = bbjVar2.e;
        AccessibilityManager accessibilityManager = bbjVar2.d;
        accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        accessibilityManager.removeTouchExplorationStateChangeListener(bbjVar2.f);
    }
}

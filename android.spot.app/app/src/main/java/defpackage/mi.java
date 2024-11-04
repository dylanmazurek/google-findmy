package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mi extends buk {
    final mj a;
    public final Map b = new WeakHashMap();

    public mi(mj mjVar) {
        this.a = mjVar;
    }

    @Override // defpackage.buk
    public final byq a(View view) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            return bukVar.a(view);
        }
        return super.a(view);
    }

    @Override // defpackage.buk
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            bukVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        lr lrVar;
        if (!this.a.j() && (lrVar = this.a.a.m) != null) {
            lrVar.aI(view, bynVar);
            buk bukVar = (buk) this.b.get(view);
            if (bukVar != null) {
                bukVar.c(view, bynVar);
                return;
            } else {
                super.c(view, bynVar);
                return;
            }
        }
        super.c(view, bynVar);
    }

    @Override // defpackage.buk
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            bukVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.buk
    public final void e(View view, int i) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            bukVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.buk
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            bukVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.buk
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        buk bukVar = (buk) this.b.get(view);
        if (bukVar != null) {
            return bukVar.g(view, accessibilityEvent);
        }
        return super.g(view, accessibilityEvent);
    }

    @Override // defpackage.buk
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        buk bukVar = (buk) this.b.get(viewGroup);
        if (bukVar != null) {
            return bukVar.h(viewGroup, view, accessibilityEvent);
        }
        return super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        if (!this.a.j() && this.a.a.m != null) {
            buk bukVar = (buk) this.b.get(view);
            if (bukVar != null) {
                if (bukVar.i(view, i, bundle)) {
                    return true;
                }
            } else if (super.i(view, i, bundle)) {
                return true;
            }
            RecyclerView recyclerView = this.a.a.m.s;
            lw lwVar = recyclerView.e;
            me meVar = recyclerView.M;
            return false;
        }
        return super.i(view, i, bundle);
    }
}

package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
import defpackage.bop;
import defpackage.bwn;
import defpackage.byi;
import defpackage.cah;
import defpackage.cai;
import defpackage.cpa;
import defpackage.ioc;
import defpackage.njz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeDismissBehavior extends bop {
    public cai a;
    public boolean b;
    public njz f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final cah h = new ioc(this);

    public static float v(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.bop
    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.g = false;
            }
        } else {
            z = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        }
        if (z) {
            if (this.a == null) {
                this.a = cai.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bop
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            bwn.n(view, ImageMetadata.SHADING_MODE);
            if (u(view)) {
                bwn.o(view, byi.h, null, new cpa(this, 2));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.bop
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.b || motionEvent.getActionMasked() != 3) {
                this.a.e(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean u(View view) {
        return true;
    }
}

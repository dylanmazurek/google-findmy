package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.jdl;
import defpackage.jer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SimpleActionView extends LinearLayout implements hjs {
    public jer a;

    public SimpleActionView(Context context) {
        this(context, null);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        if (this.a.g()) {
            hjpVar.c(this, ((Integer) this.a.c()).intValue());
        }
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        if (this.a.g()) {
            hjpVar.e(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = jdl.a;
    }
}

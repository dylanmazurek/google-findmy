package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.chip.Chip;
import defpackage.hdi;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.jdl;
import defpackage.jer;
import defpackage.maf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextualCardRootView extends FrameLayout implements hjs {
    public jer a;
    public maf b;
    public maf c;
    private Chip d;
    private Chip e;
    private int f;

    public TextualCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        if (this.a.g()) {
            hjpVar.b(this.d, ((hdi) this.a.c()).b);
            hjpVar.b(this.e, ((hdi) this.a.c()).c);
        }
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        if (this.a.g()) {
            hjpVar.e(this.d);
            hjpVar.e(this.e);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (Chip) findViewById(R.id.og_text_card_action);
        this.e = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.b = new maf(this.d);
        this.c = new maf(this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f) {
            this.f = size;
            this.b.d(size);
            this.c.d(this.f);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = jdl.a;
    }
}

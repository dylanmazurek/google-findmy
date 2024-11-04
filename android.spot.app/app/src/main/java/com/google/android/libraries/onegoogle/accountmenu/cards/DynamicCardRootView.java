package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.jdl;
import defpackage.jer;
import defpackage.jin;
import defpackage.jis;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DynamicCardRootView extends ConstraintLayout implements hjs {
    public jer i;
    public jer j;
    public boolean k;

    public DynamicCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        if (this.i.g()) {
            hjpVar.b(this, ((Integer) this.i.c()).intValue());
        }
        this.k = true;
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        this.k = false;
        if (this.i.g()) {
            hjpVar.e(this);
        }
    }

    public final jis f() {
        jin jinVar = new jin();
        hjs hjsVar = (hjs) findViewById(R.id.og_text_card_root);
        if (hjsVar != null) {
            jinVar.h(hjsVar);
        }
        return jinVar.g();
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jdl jdlVar = jdl.a;
        this.i = jdlVar;
        this.j = jdlVar;
    }
}

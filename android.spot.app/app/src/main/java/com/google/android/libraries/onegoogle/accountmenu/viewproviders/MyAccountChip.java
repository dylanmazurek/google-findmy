package com.google.android.libraries.onegoogle.accountmenu.viewproviders;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.apps.adm.R;
import com.google.android.material.chip.Chip;
import defpackage.hcc;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.jis;
import defpackage.maf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MyAccountChip extends Chip implements hjs {
    public hcc b;
    public final maf c;

    public MyAccountChip(Context context) {
        super(context, null);
        this.c = new maf(this);
        m();
    }

    private final void m() {
        Resources resources = getResources();
        this.c.c(jis.s(resources.getString(R.string.og_my_account_desc_long_length), resources.getString(R.string.og_my_account_desc_meduim_length), resources.getString(R.string.og_my_account_desc_short_length)));
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.c(this, 90139);
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        hjpVar.e(this);
    }

    public MyAccountChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new maf(this);
        m();
    }

    public MyAccountChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new maf(this);
        m();
    }
}

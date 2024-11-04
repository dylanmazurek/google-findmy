package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.hal;
import defpackage.hjp;
import defpackage.hjs;
import defpackage.nca;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccountParticle extends ConstraintLayout implements hal, hjs {
    public final AccountParticleDisc i;
    public final TextView j;
    public final TextView k;
    public boolean l;
    public nca m;
    private final TextView n;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        if (this.l) {
            hjpVar.c(this, 90144);
            this.i.f(hjpVar);
        }
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        if (this.l) {
            AccountParticleDisc accountParticleDisc = this.i;
            if (accountParticleDisc.g) {
                accountParticleDisc.b.cU(hjpVar);
            }
            if (accountParticleDisc.h) {
                accountParticleDisc.c.cU(hjpVar);
            }
            hjpVar.e(this);
        }
    }

    @Override // defpackage.hal
    public final TextView f() {
        return this.n;
    }

    @Override // defpackage.hal
    public final TextView g() {
        return this.j;
    }

    @Override // defpackage.hal
    public final TextView h() {
        return this.k;
    }

    @Override // defpackage.hal
    public final AccountParticleDisc i() {
        return this.i;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.account_particle, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        accountParticleDisc.getClass();
        this.i = accountParticleDisc;
        TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
        textView.getClass();
        this.j = textView;
        TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
        textView2.getClass();
        this.k = textView2;
        this.n = (TextView) findViewById(R.id.counter);
    }
}

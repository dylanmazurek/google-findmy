package com.google.android.apps.adm.integrations.spot.sharing;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.eku;
import defpackage.eph;
import defpackage.esy;
import defpackage.esz;
import defpackage.jis;
import defpackage.kyf;
import defpackage.kyl;
import defpackage.kzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DeviceOwnersCard extends MaterialCardView {
    public boolean g;
    private final View h;
    private final TextView k;
    private final TextView l;
    private final ImageView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final RecyclerView q;
    private final BidiFormatter r;
    private boolean s;

    public DeviceOwnersCard(Context context) {
        this(context, null);
    }

    public final void c() {
        int i;
        if (true != this.g) {
            i = R.drawable.gs_expand_more_vd_theme_24;
        } else {
            i = R.drawable.gs_expand_less_vd_theme_24;
        }
        int i2 = 0;
        this.p.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
        if (this.s) {
            RecyclerView recyclerView = this.q;
            if (true != this.g) {
                i2 = 8;
            }
            recyclerView.setVisibility(i2);
        }
    }

    public final void d(kyf kyfVar) {
        eku.c(kyfVar).b(this.m);
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        this.n.setText(this.r.unicodeWrap(kylVar.d));
        String str = kyfVar.h;
        if (TextUtils.isEmpty(str)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            this.o.setText(this.r.unicodeWrap(str));
        }
    }

    public final void e(kzq kzqVar) {
        this.k.setText(this.r.unicodeWrap(kzqVar.b));
    }

    public final void f(jis jisVar) {
        boolean isEmpty = jisVar.isEmpty();
        this.s = !isEmpty;
        int i = 8;
        if (isEmpty) {
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            return;
        }
        this.p.setVisibility(0);
        this.p.setText(getResources().getQuantityString(R.plurals.spot_sharing_application_shared_owners_title, jisVar.size(), Integer.valueOf(jisVar.size())));
        RecyclerView recyclerView = this.q;
        if (true == this.g) {
            i = 0;
        }
        recyclerView.setVisibility(i);
        this.q.U(new esz(jisVar));
    }

    public final void g(String str) {
        this.l.setVisibility(0);
        this.l.setText(getResources().getString(R.string.sharing_validation_code_as_sentence, str));
    }

    public final void h() {
        this.l.setVisibility(0);
        this.l.setText(R.string.failed_calculating_sharing_validation_code);
    }

    public final void i() {
        this.l.setVisibility(0);
        this.l.setText(R.string.calculating_sharing_validation_code);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        this.q.V(new LinearLayoutManager());
        c();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof esy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        esy esyVar = (esy) parcelable;
        super.onRestoreInstanceState(esyVar.getSuperState());
        this.g = esyVar.a;
        c();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        esy esyVar = new esy(super.onSaveInstanceState());
        esyVar.a = this.g;
        return esyVar;
    }

    public DeviceOwnersCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewFilledStyle);
    }

    public DeviceOwnersCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        View inflate = LayoutInflater.from(context).inflate(R.layout.device_and_user_card, (ViewGroup) this, true);
        this.h = inflate;
        this.k = (TextView) inflate.findViewById(R.id.main_user_title);
        this.l = (TextView) inflate.findViewById(R.id.sharing_validation_code);
        this.m = (ImageView) inflate.findViewById(R.id.device_icon);
        this.n = (TextView) inflate.findViewById(R.id.device_title);
        this.o = (TextView) inflate.findViewById(R.id.device_manufacturer);
        TextView textView = (TextView) inflate.findViewById(R.id.shared_owners_header);
        this.p = textView;
        textView.setOnClickListener(new eph(this, 7));
        this.q = (RecyclerView) inflate.findViewById(R.id.shared_owners);
        this.r = BidiFormatter.getInstance();
    }
}

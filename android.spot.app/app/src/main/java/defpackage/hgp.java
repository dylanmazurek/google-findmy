package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgp extends LinearLayout implements hjs {
    public static final /* synthetic */ int s = 0;
    private static final String t = String.valueOf(hgp.class.getName()).concat(".superState");
    private static final String u = String.valueOf(hgp.class.getName()).concat(".collapsed");
    private static final Interpolator v = new ced();
    public final MyAccountChip a;
    public final SelectedAccountView b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final ViewGroup e;
    public final cfn f;
    public final cfo g;
    public boolean h;
    public hjp i;
    public jer j;
    public hgw k;
    public hek l;
    public hcc m;
    public lnh n;
    public jer o;
    public ham p;
    public apc q;
    public final frx r;

    public hgp(Context context) {
        super(context);
        int i = jis.d;
        this.f = new cfn(jmi.a);
        this.r = new hgo(this);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.a = (MyAccountChip) findViewById(R.id.my_account_chip);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.b = selectedAccountView;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts);
        this.c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.account_management_actions);
        this.d = recyclerView2;
        recyclerView.setFocusable(false);
        recyclerView2.setFocusable(false);
        this.e = (ViewGroup) findViewById(R.id.og_critical_alert_container);
        selectedAccountView.k(200L);
        selectedAccountView.l(new ced());
        setLayoutTransition(h());
        if (!lwk.a.a().a(context)) {
            ((ViewGroup) recyclerView.getParent()).setLayoutTransition(h());
        }
        this.g = new hdm(this, 13);
    }

    public static hbl d(View view) {
        return new hbl(view, hfe.e(view.getContext()));
    }

    public static void g(lj ljVar, RecyclerView recyclerView, fs fsVar) {
        if (ljVar.a() <= 0) {
            for (int i = 0; i < recyclerView.c(); i++) {
                int c = recyclerView.c();
                if (i < c) {
                    if (((fs) recyclerView.o.get(i)).equals(fsVar)) {
                        return;
                    }
                } else {
                    throw new IndexOutOfBoundsException(i + " is an invalid index for size " + c);
                }
            }
            recyclerView.ap(fsVar);
            return;
        }
        recyclerView.ar(fsVar);
    }

    private static LayoutTransition h() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        Interpolator interpolator = v;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    public final void a(boolean z) {
        int i;
        ijs.c();
        this.h = z;
        if (true != z) {
            i = 0;
        } else {
            i = 8;
        }
        this.c.setVisibility(i);
        this.d.setVisibility(i);
        this.b.e(!z);
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.b(this.b, 90784);
        hjpVar.b(this.b.i, 111271);
    }

    public final void c(hcc hccVar, hbk hbkVar, hcy hcyVar) {
        int i;
        View.OnClickListener ewuVar;
        ijs.c();
        heb hebVar = hccVar.d;
        jer jerVar = hebVar.l;
        boolean z = true;
        if (hebVar.f.e() && (hbkVar.a() > 0 || hcyVar.a() > 0)) {
            i = 1;
        } else {
            i = 3;
        }
        this.b.m(i);
        SelectedAccountView selectedAccountView = this.b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                ewuVar = null;
            } else {
                hwx.U(false);
                hha hhaVar = new hha(new ewu(this, 7));
                hhaVar.c = this.k.b();
                hhaVar.d = this.k.a();
                hhaVar.d(this.q, 56);
                ewuVar = new hgz(hhaVar);
            }
        } else {
            ewuVar = new ewu(this, 6);
        }
        selectedAccountView.setOnClickListener(ewuVar);
        SelectedAccountView selectedAccountView2 = this.b;
        if (i == 3) {
            z = false;
        }
        selectedAccountView2.setClickable(z);
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        hjpVar.e(this.b.i);
        hjpVar.e(this.b);
    }

    public final hcy f(cfk cfkVar, int i) {
        Context context = getContext();
        hcd hcdVar = this.m.b;
        if (cfkVar == null) {
            int i2 = jis.d;
            cfkVar = new cfn(jmi.a);
        }
        return new hcy(context, hcdVar, cfkVar, this.k, this.i, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MyAccountChip myAccountChip = this.a;
        CharSequence text = myAccountChip.getText();
        this.a.c.d(((View) myAccountChip.getParent()).getMeasuredWidth());
        if (!TextUtils.equals(text, this.a.getText())) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(t);
            a(bundle.getBoolean(u));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(t, super.onSaveInstanceState());
        bundle.putBoolean(u, this.h);
        return bundle;
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hep implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hep(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [jfe, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gzn gznVar;
        gzo gzoVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                heq heqVar = (heq) this.a;
                heqVar.a(heqVar.c);
                return;
            case 1:
                hef hefVar = (hef) this.a;
                jis b = hefVar.a.b();
                b.getClass();
                hefVar.a(b);
                return;
            case 2:
                hey heyVar = (hey) this.a;
                heyVar.a(heyVar.b);
                return;
            case 3:
                hey heyVar2 = (hey) this.a;
                heyVar2.a(heyVar2.b);
                return;
            case 4:
                Object obj = this.a;
                hfg hfgVar = (hfg) obj;
                gzr gzrVar = hfgVar.a.l;
                Drawable drawable = null;
                if (gzrVar != null && (gzoVar = gzrVar.a) != null) {
                    gznVar = (gzn) gzoVar.a.f();
                } else {
                    gznVar = null;
                }
                if (gznVar != null && gznVar.c == 8) {
                    AccountParticleDisc accountParticleDisc = hfgVar.a;
                    hha hhaVar = new hha(new ewu(obj, 5));
                    hgw hgwVar = hfgVar.c;
                    hhaVar.c = hgwVar.b();
                    hhaVar.d = hgwVar.a();
                    accountParticleDisc.setOnClickListener(new hgz(hhaVar));
                    AccountParticleDisc accountParticleDisc2 = hfgVar.a;
                    accountParticleDisc2.setContentDescription(accountParticleDisc2.getResources().getString(R.string.og_obake_feature_a11y));
                    AccountParticleDisc accountParticleDisc3 = hfgVar.a;
                    int[] iArr = bwn.a;
                    accountParticleDisc3.setImportantForAccessibility(1);
                    AccountParticleDisc accountParticleDisc4 = hfgVar.a;
                    int P = hog.P(accountParticleDisc4.getContext());
                    if (P != 0) {
                        drawable = bqq.a(hfgVar.a.getContext(), P);
                        if (Build.VERSION.SDK_INT >= 23 && (drawable instanceof RippleDrawable)) {
                            ((RippleDrawable) drawable).setRadius(hfgVar.e / 2);
                        }
                    }
                    accountParticleDisc4.setBackground(drawable);
                    return;
                }
                hfgVar.a.setOnClickListener(null);
                hfgVar.a.setClickable(false);
                hfgVar.a.setContentDescription(null);
                AccountParticleDisc accountParticleDisc5 = hfgVar.a;
                int[] iArr2 = bwn.a;
                accountParticleDisc5.setImportantForAccessibility(4);
                hfgVar.a.setBackground(null);
                return;
            case 5:
                ijs.c();
                ExpandableDialogView expandableDialogView = ((hmh) this.a).al;
                if (expandableDialogView != null) {
                    View findViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new hhi(2));
                    return;
                }
                return;
            case 6:
                ((v) this.a).d();
                return;
            case 7:
                hgp hgpVar = (hgp) this.a;
                if (hgpVar.o.g()) {
                    Object c = hgpVar.o.c();
                    Context context = hgpVar.getContext();
                    Object a = hgpVar.m.b.a();
                    ViewGroup viewGroup = hgpVar.e;
                    hgw hgwVar2 = hgpVar.k;
                    hjp hjpVar = hgpVar.i;
                    frx frxVar = hgpVar.p.b;
                    ((han) c).r(context, a, viewGroup, hgwVar2, viewGroup, hjpVar, true);
                    return;
                }
                return;
            case 8:
                ((hri) this.a).n();
                return;
            case 9:
                ((hgz) this.a).a = false;
                return;
            case 10:
                ((hia) this.a).i(false);
                return;
            case 11:
                ((View) this.a).requestLayout();
                return;
            case 12:
                hia hiaVar = (hia) this.a;
                AnimatorSet animatorSet = hiaVar.t;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                hiaVar.f(true);
                return;
            case 13:
                hhw hhwVar = (hhw) this.a;
                hhwVar.a.f(true);
                hia hiaVar2 = hhwVar.a;
                hiaVar2.m(hiaVar2.e.b.b(), hhwVar.a.e.b.a());
                return;
            case 14:
                ((imq) ((hpd) ((hri) this.a).a.a()).i.a()).b(new Object[0]);
                return;
            case 15:
                ExpandableDialogView expandableDialogView2 = (ExpandableDialogView) this.a;
                expandableDialogView2.setSystemUiVisibility(expandableDialogView2.getSystemUiVisibility() & (-17));
                if (!expandableDialogView2.l()) {
                    expandableDialogView2.setSystemUiVisibility(expandableDialogView2.getSystemUiVisibility() | 16);
                }
                expandableDialogView2.k();
                return;
            case 16:
                ((hmh) this.a).aH();
                return;
            case 17:
                hny hnyVar = (hny) this.a;
                hmq hmqVar = hnyVar.h;
                hmqVar.getClass();
                if (hnyVar.b == 0) {
                    hnyVar.c = true;
                    Iterator it = hnyVar.g.iterator();
                    while (it.hasNext()) {
                        ((hnj) it.next()).k(hmqVar);
                    }
                }
                hnyVar.h.getClass();
                hnyVar.a();
                return;
            case 18:
                ((hpm) this.a).a();
                return;
            case 19:
                hsn hsnVar = (hsn) this.a;
                if (hsnVar.s.b == null) {
                    z = false;
                }
                hsnVar.b = z;
                return;
            default:
                hsn hsnVar2 = (hsn) this.a;
                if (hsnVar2.s.b == null) {
                    z = false;
                }
                hsnVar2.c = z;
                return;
        }
    }
}

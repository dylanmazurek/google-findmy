package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esu extends ess {
    public TextView a;
    public elo b;
    public hpd c;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_semantic_location, viewGroup, false);
    }

    @Override // defpackage.ag
    public final void ad() {
        super.ad();
        F().getWindow().setStatusBarColor(0);
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        F().getWindow().setStatusBarColor(iqg.k(R.dimen.m3_sys_elevation_level1, y()));
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        view.getClass();
        this.a = (TextView) K().findViewById(R.id.status_text);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) K().findViewById(R.id.home_device_animation);
        lottieAnimationView.c("semantic_location_animation.zip");
        lottieAnimationView.setVisibility(4);
        njz njzVar = new njz(lottieAnimationView);
        if (lottieAnimationView.f != null) {
            njzVar.p();
        }
        lottieAnimationView.e.add(njzVar);
        view.setBackgroundColor(iqg.k(R.dimen.m3_sys_elevation_level1, y()));
        mpp.q(bsv.c(O()), null, 0, new dzk(this, (esx) new ddh((cgq) this).q(esx.class), (mmx) null, 7), 3);
        bwb.n(view, new bvj() { // from class: est
            @Override // defpackage.bvj
            public final bya a(View view2, bya byaVar) {
                view2.getClass();
                brq f = byaVar.f(1);
                Guideline guideline = (Guideline) view2.findViewById(R.id.status_bar_guideline);
                int i = f.c;
                bnx bnxVar = (bnx) guideline.getLayoutParams();
                if (!guideline.a || bnxVar.a != i) {
                    bnxVar.a = i;
                    guideline.setLayoutParams(bnxVar);
                }
                return byaVar;
            }
        });
    }
}

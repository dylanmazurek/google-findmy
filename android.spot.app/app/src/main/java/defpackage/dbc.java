package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbc implements cyo {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dbc(LottieAnimationView lottieAnimationView, int i) {
        this.b = i;
        this.a = lottieAnimationView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v3, types: [mmx, java.lang.Object] */
    @Override // defpackage.cyo
    public final void a(Object obj) {
        if (this.b != 0) {
            ((LottieAnimationView) this.a).d((cyb) obj);
        } else if (!this.a.g()) {
            this.a.p(obj);
        }
    }

    public dbc(msd msdVar, int i) {
        this.b = i;
        this.a = msdVar;
    }
}

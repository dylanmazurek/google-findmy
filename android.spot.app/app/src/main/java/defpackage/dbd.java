package defpackage;

import android.support.v7.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbd implements cyo {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dbd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v3, types: [mmx, java.lang.Object] */
    @Override // defpackage.cyo
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            Object obj2 = this.a;
            Throwable th = (Throwable) obj;
            int i = ((LottieAnimationView) obj2).b;
            if (i != 0) {
                ((AppCompatImageView) obj2).setImageResource(i);
            }
            LottieAnimationView.a.a(th);
            return;
        }
        Throwable th2 = (Throwable) obj;
        if (!this.a.g()) {
            ?? r0 = this.a;
            th2.getClass();
            r0.p(mjo.n(th2));
        }
    }
}

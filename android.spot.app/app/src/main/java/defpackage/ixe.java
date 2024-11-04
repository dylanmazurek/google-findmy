package defpackage;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixe implements iwv {
    private final /* synthetic */ int a;
    private final ViewGroup b;

    public ixe(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.iwu
    public final void a(iwz iwzVar) {
        if (this.a != 0) {
            ((ViewPager) this.b).g(iwzVar.c);
        } else {
            ((ViewPager2) this.b).e(iwzVar.c, true);
        }
    }

    @Override // defpackage.iwu
    public final void b() {
    }

    @Override // defpackage.iwu
    public final void c() {
    }
}

package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezo implements ezr {
    private final /* synthetic */ int a;
    private final Object b;

    public ezo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ezr
    public final Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return this.b;
            }
            return this.b;
        }
        return this.b;
    }

    @Override // defpackage.ezr
    public final void b(ImageView imageView) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                dgo.d(imageView).c().e(this.b).h(imageView);
                return;
            }
            Object obj = this.b;
            dhd d = dgo.d(imageView);
            d.c().d(((lim) obj).A()).h(imageView);
            return;
        }
        dgo.d(imageView).d(this.b).h(imageView);
    }

    public ezo(String str, int i) {
        this.a = i;
        this.b = new gaf(str);
    }
}

package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kns implements knw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kns(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.knw
    public final Object a(knv knvVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new kqh((Context) knvVar.e(Context.class), ((knh) knvVar.e(knh.class)).g(), kne.m(knvVar, kqi.class), knvVar.b(kti.class), (Executor) knvVar.d((kon) this.a));
            }
            return this.a;
        }
        return this.a;
    }
}

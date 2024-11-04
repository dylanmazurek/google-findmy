package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hju implements hjt {
    public static final String[] a;
    public final Context b;
    public final jzc c;

    static {
        int i = fyn.a;
        a = new String[]{"service_googleone"};
    }

    public hju(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = ivc.y(executorService);
    }

    @Override // defpackage.hjt
    public final jyz a() {
        return iuu.m(new csf(this, 10), this.c);
    }
}

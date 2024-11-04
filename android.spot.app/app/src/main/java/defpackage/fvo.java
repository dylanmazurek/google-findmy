package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvo extends fvi {
    final /* synthetic */ Context a;
    final /* synthetic */ bym b;
    private final WeakReference c;

    public fvo(Context context, bym bymVar) {
        this.a = context;
        this.b = bymVar;
        this.c = new WeakReference(context);
    }

    @Override // defpackage.fvi
    public final void d(Status status, String str) {
        if (status.a()) {
            Intent intent = new Intent(str);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            fma.ba(status, null, this.b);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pr extends pn {
    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        pm pmVar = (pm) obj;
        pmVar.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", pmVar);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.pn
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new pc(i, intent);
    }
}

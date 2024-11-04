package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuz extends v {
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        kus kusVar = (kus) this.m.getParcelable("rpc_config_key");
        String[] stringArray = this.m.getStringArray("hosts");
        Intent intent = new Intent();
        intent.putExtra("rpc_config_key", kusVar);
        cp cpVar = new cp(x());
        cpVar.k("Select host");
        cpVar.c(stringArray, new kuy(this, intent, stringArray, 0));
        cpVar.h(new kun(this, intent, 2));
        return cpVar.b();
    }
}

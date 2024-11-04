package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuo extends v {
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        ArrayList parcelableArrayList = this.m.getParcelableArrayList("rpc_config_key");
        String[] stringArray = this.m.getStringArray("hosts");
        Intent intent = new Intent();
        intent.putExtra("rpc_config_key", parcelableArrayList);
        cp cpVar = new cp(x());
        cpVar.k("Select host");
        cpVar.c(stringArray, new kuy(this, intent, stringArray, 1));
        cpVar.h(new kun(this, intent, 0));
        return cpVar.b();
    }
}

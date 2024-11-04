package defpackage;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kuy implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ v c;
    private final /* synthetic */ int d;

    public /* synthetic */ kuy(v vVar, Intent intent, String[] strArr, int i) {
        this.d = i;
        this.c = vVar;
        this.a = intent;
        this.b = strArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.d != 0) {
            String str = this.b[i];
            Intent intent = this.a;
            intent.putExtra("result_extra", str);
            v vVar = this.c;
            vVar.C().Y(vVar.w(), -1, intent);
            return;
        }
        String str2 = this.b[i];
        Intent intent2 = this.a;
        intent2.putExtra("result_extra", str2);
        v vVar2 = this.c;
        vVar2.C().Y(vVar2.w(), -1, intent2);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gkv implements gnh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gkv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gnh
    public final Object a(gwf gwfVar) {
        String a;
        if (this.b != 0) {
            return new gkz((ChimePerAccountRoomDatabase) ((gok) this.a).d(gwfVar));
        }
        if (gwfVar == null) {
            a = "pseudonymous";
        } else {
            a = gwfVar.a();
        }
        return (ChimePerAccountRoomDatabase) bwd.g((Context) this.a, ChimePerAccountRoomDatabase.class, a.concat("_room_notifications.db")).a();
    }
}

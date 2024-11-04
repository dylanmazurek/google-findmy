package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejy {
    public static final ejy a;
    public static final ejy b;
    public static final ejy c;
    public static final ejy d;
    public static final ejy e;
    public static final ejy f;
    public static final ejy g;
    public static final ejy h;
    public static final /* synthetic */ mnq i;
    private static final /* synthetic */ ejy[] j;

    static {
        ejy ejyVar = new ejy("LOCATE", 0);
        a = ejyVar;
        ejy ejyVar2 = new ejy("DEVICE_INFO", 1);
        b = ejyVar2;
        ejy ejyVar3 = new ejy("MAKE_SOUND", 2);
        c = ejyVar3;
        ejy ejyVar4 = new ejy("STOP_SOUND", 3);
        d = ejyVar4;
        ejy ejyVar5 = new ejy("MARK_AS_LOST", 4);
        e = ejyVar5;
        ejy ejyVar6 = new ejy("UNMARK_AS_LOST", 5);
        f = ejyVar6;
        ejy ejyVar7 = new ejy("SHARE_DEVICE", 6);
        g = ejyVar7;
        ejy ejyVar8 = new ejy("NAVIGATE", 7);
        h = ejyVar8;
        ejy[] ejyVarArr = {ejyVar, ejyVar2, ejyVar3, ejyVar4, ejyVar5, ejyVar6, ejyVar7, ejyVar8};
        j = ejyVarArr;
        i = mjo.t(ejyVarArr);
    }

    private ejy(String str, int i2) {
    }

    public static ejy[] values() {
        return (ejy[]) j.clone();
    }
}

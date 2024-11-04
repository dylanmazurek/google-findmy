package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class knk extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public knk() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knk(String str) {
        super(str);
        fma.aQ(str, "Detail message must not be empty");
    }
}

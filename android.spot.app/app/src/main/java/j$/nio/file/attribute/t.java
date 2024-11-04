package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements v {
    public final /* synthetic */ FileAttributeView a;

    private /* synthetic */ t(FileAttributeView fileAttributeView) {
        this.a = fileAttributeView;
    }

    public static /* synthetic */ v c(FileAttributeView fileAttributeView) {
        if (fileAttributeView == null) {
            return null;
        }
        return fileAttributeView instanceof u ? ((u) fileAttributeView).a : AbstractC0005c.z(fileAttributeView) ? C0006d.c(AbstractC0005c.i(fileAttributeView)) : AbstractC0005c.B(fileAttributeView) ? x.c(AbstractC0005c.m(fileAttributeView)) : AbstractC0005c.D(fileAttributeView) ? J.c(AbstractC0005c.r(fileAttributeView)) : new t(fileAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.v
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }
}

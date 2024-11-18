import { Button, Card, Flex, Image, Typography } from "antd";
import bulbOff from "../assets/pic_bulboff.gif";
import bulbOn from "../assets/pic_bulbon.gif";

function BulbItem({ state, name }: { state: boolean; name: string }) {
  return (
    <Card>
      <Flex vertical align="center" justify="center" gap={16}>
        <Image src={state ? bulbOn : bulbOff} preview={false} style={{ width: 150 }} />
        <Typography.Text>
          <strong>{name}:</strong> {state ? "ON" : "OFF"}
        </Typography.Text>
      </Flex>
    </Card>
  );
}

export function LightBulbs() {
  return (
    <Flex
      align="center"
      justify="center"
      flex={1}
      style={{ height: "100vh", width: "100vw" }}
      gap={48}
      vertical
    >
      <Flex gap={48}>
        <BulbItem state={true} name="Bulb 1" />
        <BulbItem state={false} name="Bulb 2" />
        <BulbItem state={true} name="Bulb 3" />
        <BulbItem state={true} name="Bulb 4" />
      </Flex>
      <Button type="primary" size="large">
        Refresh
      </Button>
    </Flex>
  );
}
